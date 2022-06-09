package model;

public abstract class ARoom {
	protected String id;
	protected String name;
	protected String roomState = "clean";
	protected double cost;
	protected boolean available = true;
	protected ARoom(String id, String name, String roomState, double cost, boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.roomState = roomState;
		this.cost = cost;
		this.available = available;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRoomState() {
		return roomState;
	}
	public double getCost() {
		return cost;
	}
	public boolean isAvailable() {
		return available;
	}



	

}
