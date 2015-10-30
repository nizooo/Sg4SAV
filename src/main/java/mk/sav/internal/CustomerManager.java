package mk.sav.internal;

import java.util.List;

import mk.sav.entity.Customer;

public interface CustomerManager {
	
	public String getCustomerName();

	public int addCustomer(Customer customer);
	
	public List<Customer> getListCustomers();

}
