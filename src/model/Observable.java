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
		for (Observer observer : list) {
			observer.update();
		}
	}

	public int countObs() {
		return list.size();

	}
}
