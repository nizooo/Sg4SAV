package mk.sav.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_CUSTOMER")
public class Customer {

	
	@Column(name="ID")
	@GeneratedValue
	@Id
	private long id;
	
	private String name;
	private String age;
	private String address;
	private String email;
	
	@Enumerated(EnumType.STRING)
	@Column(name="FREQUENCY_NEWS")
	private Frequency newsletterFrequency;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	
	
	@Column(name="RECEIVE_NEWSLETTER")
	private Boolean receiveNewsletter;

	public Customer(){}


	public Customer(String name, String age, String address, String email, Frequency newsletterFrequency,
			Gender gender, Boolean receiveNewsletter) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.newsletterFrequency = newsletterFrequency;
		this.gender = gender;
		this.receiveNewsletter = receiveNewsletter;
	}

	public enum Gender {MALE, FEMALE;} 
	
	public enum Frequency{HOURLY, DAILY, WEEKLY, MONTHLY, ANNUALLY}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Frequency getNewsletterFrequency() {
		return newsletterFrequency;
	}

	public void setNewsletterFrequency(Frequency newsletterFrequency) {
		this.newsletterFrequency = newsletterFrequency;
	}

	public Gender getGender() {
		return this.gender;
	}

	public void setGender(Gender gender) {
		
		this.gender = gender;
	}

	public Boolean getReceiveNewsletter() {
		return receiveNewsletter;
	}

	public void setReceiveNewsletter(Boolean receiveNewsletter) {
		this.receiveNewsletter = receiveNewsletter;
	}




}
