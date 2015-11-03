package mk.sav.internal;

import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import mk.sav.config.TestInfrastructureDevConfig;
import mk.sav.entity.Address;
import mk.sav.entity.Technician;

@TransactionConfiguration(defaultRollback=false)
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestInfrastructureDevConfig.class)
@ActiveProfiles({"jdbc","test"})
public class JpaTechnicianRepositoryTest {
	
	
	@Autowired
	TechnicianRepository technicianRepository;
	
		
	@Ignore
	public void testFindById() {
		
	Technician technician = technicianRepository.findById(5);
	assertNotNull(technician);	
	}
	
	@Test 
	public void testAddTechnician(){
		Address address1 = new Address();
		address1.setCity("NewYork");
		address1.setStreet("Noterdam");
		
		Address address2 = new Address();
		address2.setCity("NewYork");
		address2.setStreet("Noterdam");
		
		Set<Address> listAdress = new HashSet<>();
		listAdress.add(address1);
		listAdress.add(address2);		
		Technician tech = new Technician("mohamed", "66", listAdress, "abc@example.tn");
		
		technicianRepository.addTechnician(tech);
		
	}
	
	

}
