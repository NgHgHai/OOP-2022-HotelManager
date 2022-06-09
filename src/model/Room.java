package model;

public class Room extends ARoom {
	AType type;
	int capacity;
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
}
