package createRoom;

import java.util.ArrayList;
import java.util.Iterator;

import javax.security.auth.login.AccountException;

import view.Confirmtation;

public class HotelManager {
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
		return "";
	}

	public String getNameUser() {
		return "";
	}

	public int totalRoom() {
		return 0;
	}

	public int totalReadyRoom() {
		return 0;
	}

	// checkIn
	public void add(CheckIn checkIn) {
		checkIns.add(checkIn);
	}

	// checkOut
	public void checkOut(String id) {

	}

	// add room
	public void add(ARoom room) {

	}

	// remove room
	public void remove(ARoom room) {

	}

	// add Account
	public void add(Account account) {

	}

	// remove Account
	public void remove(Account account) {

	}


	public static void main(String[] args) {
		
	}
}
