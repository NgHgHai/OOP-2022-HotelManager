package model;

public class PersonalData {
	String name;
	String phone;
	String email;
	String address;
	String city;
	String nationality;
	String passportNo;

	public PersonalData(String name, String phone, String email, String address, String city, String nationality,
			String passportNo) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.city = city;
		this.nationality = nationality;
		this.passportNo = passportNo;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNationality() {
		return nationality;
	}

	public String getPassportNo() {
		return passportNo;
	}

}
