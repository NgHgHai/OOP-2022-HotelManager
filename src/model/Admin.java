package model;

public class Admin extends Account {

	public Admin(String name, String pass) {
		super(name, pass);
	}
	@Override
	public boolean isAdmin() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	protected String getRank() {
		return "Admin";
	}

}
