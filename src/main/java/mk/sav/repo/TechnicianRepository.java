package mk.sav.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mk.sav.entity.Technician;

@Repository
public interface TechnicianRepository extends CrudRepository<Technician, Long> {

	
	Technician findByName(String Name);

    List<Technician> findByAge(String age);
	
	
}
