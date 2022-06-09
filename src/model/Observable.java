package model;

import java.util.ArrayList;

public abstract class Observable {
private ArrayList<Observer> list = new ArrayList<>();
public void addObs(Observer observer) {
	list.add(observer);
}
public void removeObs(Observer observer) {
	list.remove(observer);
}
public void notifyObs() {
	System.out.println(list.size());
	System.out.println("goi tung man hinh update");
	for (Observer observer : list) {
		observer.update();
	}
}
public int countObs() {
	return list.size();
	
}
}
