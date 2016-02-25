package mk.sav.internal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mk.sav.config.TestInfrastructureDevConfig;
import mk.sav.entity.Customer;
import mk.sav.entity.Customer.Frequency;
import mk.sav.entity.Customer.Gender;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestInfrastructureDevConfig.class)
@ActiveProfiles({"jdbc","test"})
public class JdbcCustomerManagerTest {
	
	//private static Logger LOGGER = Logger.getLogger(JdbcCustomerManagerTest.class);
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(JdbcCustomerManagerTest.class);
	
//	@Autowired
//	public JdbcTemplate jdbcTemplate;
	
	
	//@Qualifier(value="jdbcCustomerManager")
	@Autowired
	public CustomerManager customerManager;
	

	
//	@Before
//	public void setUp() throws Exception{
//		
//	//	jdbcCustomerManager = new JdbcCustomerManager(jdbcTemplate);
//		
//	}

	@Test
	public void testGetCustomerName(){
		
//		Assert.assertNotNull(jdbcTemplate);
	//	Assert.assertEquals("Test", customerManager.getCustomerName("Test"));
	}
	
	@Test
	public void testGetListCustomers(){
		
		customerManager.getListCustomers();
	}
	
	@Test
	public void testAddcustomer(){
		Customer customer = new Customer();
		customer.setName("toto");
		customer.setAge("32");
		customer.setAddress("rue abcdef");
		customer.setEmail("toto@example.com");
		customer.setNewsletterFrequency(Frequency.DAILY);
		//LOGGER.info("la valeur de Gendre.MALE.getGenderIndex() est = "+Gende.MALE.getGenderIndex());
		customer.setGender(Gender.FEMALE);
		customer.setReceiveNewsletter(false);
		Assert.assertEquals(1, customerManager.addCustomer(customer));
	}
	

}
