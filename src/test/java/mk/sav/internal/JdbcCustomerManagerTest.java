package mk.sav.internal;

import org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import  static org.junit.Assert.*;

import org.junit.Ignore;

import mk.sav.entity.Customer;

@RunWith(MockitoJUnitRunner.class)
public class JdbcCustomerManagerTest {
	@Mock
	private JdbcTemplate jdbcTemplate;
	@InjectMocks
	private JdbcCustomerManager jdbcCustomerManager;
	
	@InjectMocks
	private Customer customer;

	@Test
	public void testGetCustomerName(){
		System.out.println("first name = "+jdbcCustomerManager.getCustomerName());
		//assertEquals("moghzel",jdbcCustomerManager.getCustomerName());
		
	}
	
//	@Ignore
//	public void testAddCustomer() throws Exception {
//		 
//	 assertTrue(jdbcCustomerManager.addCustomer(customer)); 
//	}

}
