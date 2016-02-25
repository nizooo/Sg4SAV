package mk.sav.internal;

import java.util.List;

import org.springframework.stereotype.Component;

import mk.sav.entity.Customer;

@Component
public interface CustomerManager {
	

	public int addCustomer(Customer customer);
	
	public List<Customer> getListCustomers();

}
