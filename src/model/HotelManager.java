package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HotelManager extends model.Observable {
//	private ArrayList<ARoom> rooms = new ArrayList<ARoom>();
//	private ArrayList<Account> accounts = new ArrayList<Account>();
	private Set<ARoom> rooms = new HashSet<ARoom>();
	private Set<Account> accounts = new HashSet<Account>();
	private ArrayList<CheckIn> checkIns = new ArrayList<CheckIn>();
	/*
	 * thay doi kieu du lieu, bi sai ve mat logic phai thay Account, ARoom thanh set
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
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
		for (Account account : accounts) {
			if (account.getName().equals(name) && account.getPass().equals(pass)) {
				user = account; // luu lai acc
				return true;
			}
		}
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

		for (ARoom room : rooms) {
			if (room.available) {
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
	public boolean add(ARoom room) {
		boolean success = rooms.add(room);
		notifyObs();
		return success;

	}

	// remove room
	public boolean remove(ARoom room) {
		boolean success = rooms.remove(room);
		notifyObs();
		return success;

	}

	// add Account
	public boolean add(Account account) {
		boolean success = accounts.add(account);
		notifyObs();
		return success;

	}

	// remove Account
	public boolean remove(Account account) {
		boolean success = accounts.remove(account);
		notifyObs();
		return success;
	}

	public Set<ARoom> getRooms() {
		return rooms;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public ArrayList<CheckIn> getCheckIns() {
		return checkIns;
	}

}
