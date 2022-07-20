package model;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ARoom other = (ARoom) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "ARoom id= " + id;
	}

}
