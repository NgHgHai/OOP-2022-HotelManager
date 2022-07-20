package model;

import java.util.Objects;

public abstract class Account {
	protected String name;
	protected String pass;

	public Account(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
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

	protected abstract String getRank();

	public boolean isAdmin() {
		return false;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Account))
			return false;
		Account other = (Account) obj;
		return Objects.equals(name, other.name);
	}

}
