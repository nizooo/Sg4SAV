package mk.sav.entity;

public class Ticket {
	
	private String title;
	private String id;
	private String description;
	
	private Customer customer;
	private Technician technician;
	private Equipment equipment;
	
	
	
	
	public Ticket(String title, String id, String description, Customer customer, Technician technician,Equipment equipment) {
		super();
		this.title = title;
		this.id = id;
		this.description = description;
		this.customer = customer;
		this.technician = technician;
		this.equipment = equipment;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Technician getTechnician() {
		return technician;
	}
	public void setTechnician(Technician technician) {
		this.technician = technician;
	}
	
	
	
	
	

}
