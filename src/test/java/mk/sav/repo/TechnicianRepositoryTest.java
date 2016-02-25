package mk.sav.repo;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mk.sav.config.AppConfig;
import mk.sav.config.DbConfigTest;
import mk.sav.entity.Address;
import mk.sav.entity.Technician;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class,DbConfigTest.class})
@ActiveProfiles({"jpa","test"})
public class TechnicianRepositoryTest {

	@Autowired
	public TechnicianRepository technicianRepo;
	
	@Test
	public void testSave(){
		
		Address address = new Address();
		address.setCity("blabla");
		Set<Address> addressSet = new HashSet<>();
		addressSet.add(address);
		Technician tech = new Technician("tech1", "36", addressSet, "tech1@gmail.com");
		
		technicianRepo.save(tech);
	}

}
