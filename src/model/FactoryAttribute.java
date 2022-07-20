package model;

import java.util.Set;

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

	public AType createType(String type) {

		if (type.equals("Normal")) {
			return new Normal();
		}
		if (type.equals("Economy")) {
			return new Economy();
		}
		return new VIP();
	}

	public ARoom addRoom(String id, String name, String roomState, double cost, boolean available, String type,
			int capacity) {

		ARoom rs = new Room(id, name, roomState, cost, available, createType(type), capacity);
		return rs;
	}

}
