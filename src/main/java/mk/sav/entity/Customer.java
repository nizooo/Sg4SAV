package mk.sav.entity;

public class Customer {

	private String name;
	private String age;
	private String address;
	private String email;
	private Frequency newsletterFrequency;
	private Gender gender;
	private Boolean receiveNewsletter;




	public enum Gender {
		MALE(0), FEMALE(1);
		private int index;

		private Gender(int index){
			this.index = index;
		}
		public int getGenderIndex(){
			return this.index;
		}
		public void setGenderIndex(int index){
			this.index = index;			
		}
	} 



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
