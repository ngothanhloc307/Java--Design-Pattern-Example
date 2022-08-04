package Memento;

import java.util.ArrayList;

public class CareTaker {
	ArrayList<Memento> mementorList = new ArrayList<>();
	
	public void saveState(Memento mem) {
		mementorList.add(mem);
	}
	
	public Memento restoreState(int index) {
		return mementorList.get(index);
	}
}
