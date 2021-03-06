package mk.sav.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mk.sav.entity.Customer;
import mk.sav.repo.CustomerRepository;

public class JpaCustomerManager implements CustomerManager {
	
	@Autowired
	public CustomerRepository customerRepo;



	@Override
	public Customer addCustomer(Customer customer) {
		Customer cust = customerRepo.save(customer);
		return cust;
	
	}

	@Override
	public List<Customer> getListCustomers() {
		
		Iterator<Customer> it = customerRepo.findAll().iterator();
		List<Customer> listC = new ArrayList<>();
		while(it.hasNext()){
			listC.add(it.next());
		}
		return listC;
	}

}
