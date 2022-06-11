package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;

import javax.security.auth.login.AccountException;

import view.Confirmtation;

public class HotelManager extends model.Observable {
	private ArrayList<ARoom> rooms = new ArrayList<ARoom>();
	private ArrayList<Account> accounts = new ArrayList<Account>();
	private ArrayList<CheckIn> checkIns = new ArrayList<CheckIn>();
	private Account user;
	FactoryAttribute attribute = new FactoryAttribute();

	public HotelManager() {

	}

	// hoi quyen truy cap : setting, guest,...
	public boolean hasRight(String command) {
		return user.hasRight(command);
	}

	// login
	public boolean isAccount(String name, String pass) {
		return false;
	}

	// homepage
	public String getRank() {
		return user.getRank();
	}

	public String getNameUser() {
		return user.getName();
	}

	public int totalRoom() {
		return rooms.size();
	}

	public int totalReadyRoom() {
		int result = 0;
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).isAvailable()) {
				result++;
			}
		}
		return result;
	}

	// checkIn
	public void add(CheckIn checkIn) {
		checkIn.room.available = false;
		checkIns.add(checkIn);
		notifyObs();
	}

	// checkOut
	public void checkOut(String id) {

	}

	// add room
	public void add(ARoom room) {
		rooms.add(room);
		notifyObs();

	}

	// remove room
	public void remove(ARoom room) {
		rooms.remove(room);
		notifyObs();

	}

	// add Account
	public void add(Account account) {
		accounts.add(account);
		notifyObs();

	}

	// remove Account
	public void remove(Account account) {
		accounts.remove(account);
		notifyObs();

	}
	
	

	public ArrayList<ARoom> getRooms() {
		return rooms;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public ArrayList<CheckIn> getCheckIns() {
		return checkIns;
	}


}
