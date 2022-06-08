package createRoom;

public class FactoryAttribute {
public FactoryAttribute() {
	// TODO Auto-generated constructor stub
}
public AType produceType(String type) {
	if (type.equals("VIP")) {
		return new VIP(); 
	} else if (type.equals("Normal")) {
		return new Normal();
	} else if (type.equals("Economy")) {
		return new Economy();
	}
	return null;
}

}
