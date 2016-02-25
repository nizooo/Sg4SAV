package mk.sav.repo;

import org.springframework.data.repository.CrudRepository;

import mk.sav.entity.Customer;

public interface  CustomerRepository extends CrudRepository<Customer, Long> {
	

	public Customer findByName(String name);
}
