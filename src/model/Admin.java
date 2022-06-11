package model;

public class Admin extends Account {

	public Admin(String name, String pass) {
		super(name, pass);
	}

	@Override
	protected String getRank() {
		return "Admin";
	}

}
