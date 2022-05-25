package createRoom;

public abstract class AType implements IType {
	String type;

	public AType() {
		super();
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return type;
	}

}
