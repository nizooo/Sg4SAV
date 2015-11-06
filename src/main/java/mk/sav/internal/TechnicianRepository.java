package mk.sav.internal;

import mk.sav.entity.Technician;

public interface TechnicianRepository {

	
	public Technician findById(long technicianId);
	
	
	public boolean addTechnician(Technician technician);
}
