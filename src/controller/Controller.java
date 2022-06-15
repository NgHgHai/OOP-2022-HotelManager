package controller;

import java.util.Date;

import model.HotelManager;
import view.Login;

public class Controller {
	private HotelManager manager;
	private Login login;

	public Controller(HotelManager manager) {
		super();
		this.manager = manager;
		login = new Login(manager, this);
		login.setVisible(true);

	}

	public boolean isAccout(String name, String pass) {

		return manager.isAccount(name, pass);
	}

	public boolean addAccount(String name, String pass, boolean selected) {

		return manager.addAccount(name, pass, selected);
	}

	public String search(String roomType, int roomCapacity) {
		// TODO Auto-generated method stub
		return manager.searchModel(roomType, roomCapacity);

	}

	public boolean saveCheckIn(String name, String phone, String email, String address, String city, String nationality,
			String passsport, String cardNumber, String codeCVC, String roomType, int roomCapacity, Date checkInDate,
			Date checkOutDate, String roomID) {
		return manager.saveCheckInModel(name, phone, email, address, city, nationality, passsport, cardNumber, codeCVC,
				roomType, roomCapacity, checkInDate, checkOutDate, roomID);

	}
}
