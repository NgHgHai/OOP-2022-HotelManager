package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class HotelManager extends model.Observable {
//	private ArrayList<ARoom> rooms = new ArrayList<ARoom>();
//	private ArrayList<Account> accounts = new ArrayList<Account>();
	private Set<ARoom> rooms = new HashSet<ARoom>(); // theo id phong
	private Set<Account> accounts = new HashSet<Account>(); // theo ten tai khoan
	private ArrayList<CheckIn> checkInList = new ArrayList<CheckIn>();
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
	public boolean add(CheckIn checkIn) {
		checkIn.getRoom().available = false;
		boolean success = checkInList.add(checkIn);
		notifyObs();
		return success;
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
		return checkInList;
	}

	public boolean addAccount(String name, String pass, boolean selected) {
		Account account = FactoryAttribute.createAccount(name, pass, selected);
		return add(account);
	}

	public String searchModel(String roomType, int roomCapacity) {
		// TODO Auto-generated method stub
		String roomID = "";
		for (ARoom room : rooms) {
			Room concretaRoom = (Room) room;
			if (roomType.equals(concretaRoom.getType().getName()) && (roomCapacity == concretaRoom.getCapacity())
					&& (concretaRoom.isAvailable())) {
				roomID = concretaRoom.id;
			} else {
				roomID = "No room";
			}
		}
		return roomID;
	}

	public ARoom getRoom(String idRoom) {
		for (ARoom room : rooms) {
			if (idRoom.equals(room.getId())) {
				return room;
			}
		}
		return null;

	}

	public boolean saveCheckInModel(String name, String phone, String email, String address, String city,
			String nationality, String passsport, String cardNumber, String codeCVC, String roomType, int roomCapacity,
			Date checkInDate, Date checkOutDate, String roomID) {
		if (getRoom(roomID) == null || getRoom(roomID).available) {
			return false;
		}
		if(checkInDate==null || checkOutDate==null) {
			return false;
		}
		PersonalData data = new PersonalData(name, phone, email, address, city, nationality, passsport);
		Payment payment = new Payment(roomID, cardNumber);
		CheckIn checkIn = new CheckIn(data, payment, getRoom(roomID), false, checkInDate, checkOutDate);
		return add(checkIn);

	}

}
