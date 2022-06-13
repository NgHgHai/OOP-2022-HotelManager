package controller;

import java.awt.EventQueue;
import java.util.Date;

import model.ARoom;
import model.Account;
import model.Admin;
import model.CheckIn;
import model.Customer;
import model.Economy;
import model.HotelManager;
import model.Normal;
import model.Payment;
import model.PersonalData;
import model.Room;
import model.VIP;
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
		
		return manager.addAccount(name,pass,selected);
	}
}
