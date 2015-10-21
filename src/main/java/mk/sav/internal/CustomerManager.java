package mk.sav.internal;

import mk.sav.entity.Customer;

public interface CustomerManager {
	
	public String getCustomerName();

	public boolean addCustomer(Customer customer);

}
