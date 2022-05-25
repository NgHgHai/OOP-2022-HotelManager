package createRoom;

import java.util.ArrayList;
import java.util.Iterator;

public class RoomManager {
	private ArrayList<Room> rooms = new ArrayList<Room>();
	static int countId = 1;
	FactoryAttribute attribute = new FactoryAttribute();

	public RoomManager() {
		super();
	}

	public void addRoom(String type, String capa, String name, double cost) {
		rooms.add(new Room(attribute.produceType(type), attribute.produceCapacity(capa), name, cost, 1000 + countId++));
	}

	public void removeRoom(int id) {
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getId() == id) {
				rooms.remove(i);
			}
		}
	}

	public void setType(int id, IType type) {
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getId() == id) {
				rooms.get(i).setType(type);
			}
		}
	}

	public void setCapacity(int id, ICapacity capacity) {
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getId() == id) {
				rooms.get(i).setCapa(capacity);
			}
		}
	}

	public void setName(int id, String name) {
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getId() == id) {
				rooms.get(i).setName(name);
			}
		}
	}

	public void setCost(int id, double cost) {
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getId() == id) {
				rooms.get(i).setCost(cost);
			}
		}
	}

	public void printRooms() {
		for (Iterator iterator = rooms.iterator(); iterator.hasNext();) {
			Room aRoom = (Room) iterator.next();
			System.out.println(aRoom);
		}
	}

	public double getBill(int id) {
		double resule = 0;
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getId() == id) {
				Room room = rooms.get(i);
//				System.out.println((((4.0 + 6.0) / 100) * 49.0) + 49);
				resule = (((room.getCapa().tip() + room.getType().tip()) / 100) * room.getCost()) + room.getCost();
			}
		}
		return resule;
	}

	public static void main(String[] args) {
		RoomManager manager = new RoomManager();

		manager.addRoom("VIP", "Single", " King ", 22);
		manager.addRoom("Economy", "Single", " god ", 27);
		manager.addRoom("VIP", "Triple", " good ", 59);
		manager.addRoom("Economy", "Single", " ghost ", 29);
		manager.addRoom("Normal", "Single", " prince ", 19);
		manager.addRoom("Economy", "Single", " queen ", 89);

		manager.printRooms();
		System.out.println(" ------ ");
		manager.setType(1006, new Normal());
		manager.removeRoom(1001);

		manager.addRoom("Economy", "Double", " A King ", 49);

		manager.printRooms();
		System.out.println(manager.getBill(1003));
	}
}
