package model;

public class Admin extends Account {

	public Admin(String name, String pass, boolean admin) {
		super(name, pass, admin);
	}

	@Override
	protected String getRank() {
		return "Admin";
	}

}
