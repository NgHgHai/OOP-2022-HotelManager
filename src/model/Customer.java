package model;

public class Customer extends Account {

	public Customer(String name, String pass, boolean admin) {
		super(name, pass, admin);
	}

	@Override
	protected String getRank() {
		return "Customer";
	}

}
