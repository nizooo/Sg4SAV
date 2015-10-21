package mk.sav.internal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.jdbc.core.JdbcTemplate;

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
	public void testAddCustomer() throws Exception {
		 
	 Assert.assertTrue(jdbcCustomerManager.addCustomer(customer)); 
	}

}
