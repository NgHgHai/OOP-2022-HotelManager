package createRoom;

public class PersonalData {
private String name;
private String phone;
private String email;
private String address;
private String city;
private String nationality;
private String passportNo;
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
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
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
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public String getPassportNo() {
	return passportNo;
}
public void setPassportNo(String passportNo) {
	this.passportNo = passportNo;
}


}
