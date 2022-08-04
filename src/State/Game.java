package State;

public class Game {

	public State state = new WelcomScreenState(this);
	
	public void changeState(State state) {
		this.state = state;
	}
}
