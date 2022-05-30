package createRoom;

import java.util.Date;

public abstract class ARoom {
	private IType type;
	private ICapacity capa;
	private String name;
	private double cost;
	private int id;
	private boolean available = true ;
	private String roomState = "clean"; 
//	private Date checkInDate;
//	private Date checkOutDate;


public ARoom(IType type, ICapacity capa, String name, double cost, int id, String roomState) {
	super();
	this.type = type;
	this.capa = capa;
	this.name = name;
	this.cost = cost;
	this.id = id;
	this.roomState = roomState;
}

//	private ICapacity capaFactory(String capa) {
//		// TODO Auto-generated method stub
//		if (capa.equals("Single")) {
//			return new Single();
//		} else if (capa.equals("Double")) {
//			return new Double();
//		} else if (capa.equals("Triple")) {
//			return new Triple();
//		}
//		return null;
//	}
//
//	private IType typeFactory(String type) {
//		// TODO Auto-generated method stub
//		if (type.equals("VIP")) {
//			return new VIP();
//		} else if (type.equals("Normal")) {
//			return new Normal();
//		} else if (type.equals("Economy")) {
//			return new Economy();
//		}
//		return null;
//	}

	public String getRoomState() {
	return roomState;
}

public void setRoomState(String roomState) {
	this.roomState = roomState;
}

	public IType getType() {
		return type;
	}

	public void setType(IType type) {
		this.type = type;
	}

	public ICapacity getCapa() {
		return capa;
	}

	public void setCapa(ICapacity capa) {
		this.capa = capa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getId() {
		return id;
	}
	

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "ARoom [type=" + type + ", capa=" + capa + ", name=" + name + ", cost=" + cost + ", id=" + id + "]";
	}

}
