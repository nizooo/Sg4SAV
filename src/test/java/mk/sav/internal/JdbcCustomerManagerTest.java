package mk.sav.internal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mk.sav.config.TestInfrastructureDevConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestInfrastructureDevConfig.class)
@ActiveProfiles("jdbc")
public class JdbcCustomerManagerTest {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public JdbcCustomerManager jdbcCustomerManager;
	

	
	@Before
	public void setUp() throws Exception{
		
		jdbcCustomerManager = new JdbcCustomerManager(jdbcTemplate);
		
	}

	@Test
	public void testGetCustomerName(){
		
		Assert.assertNotNull(jdbcTemplate);
		//System.out.println("first name = "+jdbcCustomerManager.getCustomerName());
		//assertEquals("moghzel",jdbcCustomerManager.getCustomerName());
		Assert.assertEquals("RAMITest", jdbcCustomerManager.getCustomerName());
	}
	
	
	
	
//	@Ignore
//	public void testAddCustomer() throws Exception {
//		 
//	 assertTrue(jdbcCustomerManager.addCustomer(customer)); 
//	}

}
