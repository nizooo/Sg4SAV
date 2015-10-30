package mk.sav.internal;

import java.util.List;

import mk.sav.entity.*;

public class StubCustomerManager implements CustomerManager {

	public String getCustomerName() {
		return "Titi";
	}


	public int addCustomer(Customer customer) {
	
		return 2;
	}


	@Override
	public List<Customer> getListCustomers() {
		// TODO Auto-generated method stub
		return null;
	}



}
