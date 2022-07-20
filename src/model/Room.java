package model;

public class Room extends ARoom {
	private AType type;
	private int capacity;

	public Room(String id, String name, String roomState, double cost, boolean available, AType type, int capacity) {
		super(id, name, roomState, cost, available);
		this.type = type;
		this.capacity = capacity;
	}

	public AType getType() {
		return type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setType(AType type) {
		this.type = type;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Room [type=" + type + ", capacity=" + capacity + ", id=" + id + "]\n";
	}

}
