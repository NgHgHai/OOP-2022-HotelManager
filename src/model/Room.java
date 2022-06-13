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
	/**
	 * @param type the type to set
	 */
	public void setType(AType type) {
		this.type = type;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
