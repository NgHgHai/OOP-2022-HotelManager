package createRoom;

public class Room extends ARoom {
	private AType type;
	private int capacity;
	public Room(String id, String name, String roomState, double cost, boolean available, AType type, int capacity) {
		super(id, name, roomState, cost, available);
		this.type = type;
		this.capacity = capacity;
	}
	





}
