package model;

public class Admin extends Account {

	public Admin(String name, String pass) {
		super(name, pass);
	}

	@Override
	public boolean isAdmin() {
		return true;
	}

	@Override
	protected String getRank() {
		return "Admin";
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", pass=" + pass + "]";
	}

}
