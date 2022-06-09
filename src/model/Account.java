package model;

public abstract class Account {
	protected String name;
	protected String pass;
	protected boolean admin;

	public Account(String name, String pass, boolean admin) {
		super();
		this.name = name;
		this.pass = pass;
		this.admin = admin;
	}

	// template
	public final boolean hasRight(String command) {
		if (isAdmin()) {
			return true;
		}
		if (command.equals("setting")) {
			return accessSetting();
		}
		if (command.equals("room")) {
			return accessRoom();
		}
		if (command.equals("guest")) {
			return accessGuest();
		}
		return false;
	}

	protected boolean accessGuest() {
		return false; // the hook
	}

	protected boolean accessRoom() {
		return false;// the hook
	}

	protected boolean accessSetting() {
		return false;// the hook
	}

	protected boolean isAdmin() {
		return admin;
	}

	protected abstract String getRank();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	

}
