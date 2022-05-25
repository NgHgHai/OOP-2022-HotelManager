package createRoom;

public abstract class ACapacity implements ICapacity {
	String capacity;

	public ACapacity() {
		super();
	}
	@Override
	public String getCapacity() {
		// TODO Auto-generated method stub
		return capacity;
	}

	@Override
	public String toString() {
		return  capacity ;
	}
	
}
