package model;

public class FactoryAttribute {
public FactoryAttribute() {
	// TODO Auto-generated constructor stub
}
public AType produceType(String type) {
	if (type.equals("VIP")) {
		return new VIP(); 
	} else if (type.equals("Normal")) {
		return new Normal();
	} else if (type.equals("Economy")) {
		return new Economy();
	}
	return null;
}
public static Account createAccount(String name, String pass, boolean selected) {
	Account account;
	if (selected) {
		account = new Admin(name, pass);
	} else
		account = new Customer(name, pass);
	return account;
}

}
