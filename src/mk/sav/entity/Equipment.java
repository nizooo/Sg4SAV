package mk.sav.entity;

import java.math.BigDecimal;

public class Equipment {
	
	private String name;
	private String description;
	private String serialNumber;
	private String model;
	
	
	/**
	 * 
	 * @param name
	 * @param description
	 * @param price
	 */
	public Equipment(String name, String description, String serialNumber) {
		super();
		this.name = name;
		this.description = description;
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	
	
	

}
