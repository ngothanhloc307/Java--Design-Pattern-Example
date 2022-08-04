package Memento;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator("Initial State");
		CareTaker careTaker = new CareTaker();
		
		careTaker.saveState(originator.createMemento());
		System.out.println("Current state is: " + originator.state);
		
		originator.state = "State 1";
		careTaker.saveState(originator.createMemento());
		System.out.println("Current state is: " + originator.state);
		
		originator.state = "State 2";
		careTaker.saveState(originator.createMemento());
		System.out.println("Current state is: " + originator.state);
		
		System.out.println("---------------------------------------");
		
		originator.restorMemento(careTaker.restoreState(1));
		System.out.println("Current state is: " + originator.state);
		
		originator.restorMemento(careTaker.restoreState(0));
		System.out.println("Current state is: " + originator.state);
		
		originator.restorMemento(careTaker.restoreState(2));
		System.out.println("Current state is: " + originator.state);
		
	}
}
