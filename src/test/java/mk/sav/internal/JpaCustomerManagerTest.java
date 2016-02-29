package mk.sav.internal;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import mk.sav.config.AppConfig;
import mk.sav.config.DbConfigTest;
import mk.sav.entity.Customer;
import mk.sav.entity.Customer.Frequency;
import mk.sav.entity.Customer.Gender;

@ContextConfiguration(classes={DbConfigTest.class,AppConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles({"test","jpa"})
@Transactional
public class JpaCustomerManagerTest {

	
	@Autowired
	CustomerManager customerManger;
	
	@Test
	public void testAddcustomer(){
		Customer customer = new Customer("toto","66","6 rue blabl","toto@test.com",Frequency.DAILY,Gender.MALE,Boolean.TRUE);		
		Customer cust_inserted = customerManger.addCustomer(customer);		
		assertEquals(cust_inserted.getAge(), "66");
		assertEquals(cust_inserted.getAddress(), "6 rue blabl");
		assertEquals(cust_inserted.getEmail(), "toto@test.com");
		
	}
	
	@Test
	public void testGetListCustomers(){
		
		List<Customer> list  =  customerManger.getListCustomers();
		assertEquals(list.size(), 3);
		
	
	}
	
	
	
	
}
