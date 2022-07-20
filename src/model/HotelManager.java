package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import view.Bill;

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
	private int createID = 1000;
	private CheckIn checkIn;

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
				notifyObs();
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

	public CheckIn getCheckIn() {
		return checkIn;
	}

	// checkOut
	public boolean checkOut(String id) {
		for (CheckIn c : checkInList) {
			if (c.getRoom().getId().equals(id)) {
				checkIn = c;
				notifyObs();
				return true;
			}
		}
		return false;
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

	public boolean removeAccount(String name) {
		for (Account account : accounts) {
			if (name.equals(account.getName())) {
				return remove(account);
			}
		}
		return false;
	}

	public boolean addRoom(String id, String name, String roomState, double cost, boolean available, String type,
			int capacity) {
		if (name.equals("")) {
			return false;
		}
		if (type == null) {
			return false;
		}
		if (capacity == 0) {
			return false;
		}
		if (id.equals("")) {
			id = createID++ + "";
		}
		ARoom aroom = attribute.addRoom(id, name, roomState, cost, available, type, capacity);
		return add(aroom);
	}

	public boolean removeRoom(String id) {
		for (ARoom room : rooms) {
			if (id.equals(room.getId())) {
				return remove(room);
			}
		}
		return false;
	}

	public String searchModel(String roomType, int roomCapacity) {
		// TODO Auto-generated method stub
		String roomID = "";
		System.out.println(roomType + " " + roomCapacity);
		for (ARoom room : rooms) {
			Room concretaRoom = (Room) room;

			if (concretaRoom.getType().getName().equals(roomType) && (roomCapacity == concretaRoom.getCapacity())
					&& (concretaRoom.isAvailable())) {
//				System.out.println("cooooo");
				return roomID = concretaRoom.id;
			} else {
				roomID = "No room";
			}
		}
		return roomID;
	}

	public ArrayList<Room> searchListRoomModel(String roomType, int roomCapacity) {
		ArrayList<Room> result = new ArrayList<Room>();
		for (ARoom room : rooms) {
			Room concretaRoom = (Room) room;
			if (concretaRoom.getType().getName().equals(roomType) && (roomCapacity == concretaRoom.getCapacity())
					&& (concretaRoom.isAvailable())) {
				result.add(concretaRoom);
			}
		}
		return result;
	}

	public ARoom getRoom(String idRoom) {
		for (ARoom room : rooms) {
			if (room.getId().equals(idRoom)) {
				return room;
			}
		}
		return null;

	}

	public boolean saveCheckInModel(String name, String phone, String email, String address, String city,
			String nationality, String passsport, String cardNumber, String codeCVC, String roomType, int roomCapacity,
			Date checkInDate, Date checkOutDate, String roomID) {
		if (getRoom(roomID) == null || !getRoom(roomID).isAvailable()) {
			return false;
		}
		if (checkInDate == null || checkOutDate == null) {
			System.out.println("date");
			return false;
		}

		PersonalData data = new PersonalData(name, phone, email, address, city, nationality, passsport);
		Payment payment = new Payment(cardNumber, codeCVC);
		CheckIn checkIn = new CheckIn(data, payment, getRoom(roomID), false, checkInDate, checkOutDate);
		return add(checkIn);
	}

	public Account getUser() {

		return user;
	}

	public void paid(String idRoom) {
		// TODO Auto-generated method stub
		getRoom(idRoom).available = true; // phong trong
		getCheckIn(idRoom).paid(); //
		notifyObs();

	}

	private CheckIn getCheckIn(String idRoom) {
		// TODO Auto-generated method stub
		for (CheckIn checkIn : checkInList) {
			if (checkIn.getRoom().getId().equals(idRoom) && !checkIn.isPay()) {
				return checkIn;
			}
		}
		return null;

	}

}
