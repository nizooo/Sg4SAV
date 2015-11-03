package mk.sav.internal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import mk.sav.entity.Technician;

//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import mk.sav.entity.Technician;
//

@Repository
public class JpaTechnicianRepository implements TechnicianRepository {



	private EntityManager entityManager;
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager){
		
		this.entityManager = entityManager;
	}
	

	
	public Technician findById(long technicianId) {
		// TODO Auto-generated method stub
		return null;
	}
//



	@Override
	public boolean addTechnician(Technician technician) {
		// TODO Auto-generated method stub
		entityManager.persist(technician);
		return false;
	}
}
