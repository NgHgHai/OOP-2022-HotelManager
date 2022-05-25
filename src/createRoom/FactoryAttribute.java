package createRoom;

public class FactoryAttribute {
public FactoryAttribute() {
	// TODO Auto-generated constructor stub
}
public IType produceType(String type) {
	if (type.equals("VIP")) {
		return new VIP(); 
	} else if (type.equals("Normal")) {
		return new Normal();
	} else if (type.equals("Economy")) {
		return new Economy();
	}
	return null;
}
public ICapacity produceCapacity(String capa) {
	if (capa.equals("Single")) {
		return new Single();
	} else if (capa.equals("Double")) {
		return new Double();
	} else if (capa.equals("Triple")) {
		return new Triple();
	} 
	return null;
}
}
