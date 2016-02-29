package mk.sav.internal;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mk.sav.config.AppConfig;
import mk.sav.config.DbConfigTest;
import mk.sav.entity.Address;
import mk.sav.entity.Technician;
import mk.sav.repo.TechnicianRepository;

@Import({AppConfig.class,DbConfigTest.class})
@ContextConfiguration(classes={AppConfig.class, DbConfigTest.class})
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles({"test","jpa"})
public class JpaTechnicianManagerTest {

	
	@Autowired
	public TechnicianRepository technicianRepo;
	
	@Test
	public void testSave(){
		
		Address address = new Address();
		address.setCity("blabla");
		Set<Address> addressSet = new HashSet<>();
		addressSet.add(address);
		Technician tech = new Technician("tech1", "36", addressSet, "tech1@gmail.com");
		
		Technician tech_inserted =   technicianRepo.save(tech);
		assertEquals(tech_inserted.getName(), "tech1");
		assertEquals(tech_inserted.getAge(), "36");
		assertEquals(tech_inserted.getEmail(), "tech1@gmail.com");
		
	}
}
