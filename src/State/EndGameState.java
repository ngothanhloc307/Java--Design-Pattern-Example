package State;

public class EndGameState extends State{
	
	public EndGameState(Game game) {
		super(game);
		System.out.println("--- Game in EndGame state ---");
	}

	@Override
	public void onWelcomeScreen() {
		game.changeState(new WelcomScreenState(game));
	}

	@Override
	public void onPlaying() {
		System.out.println("Not allowed.");
		
	}

	@Override
	public void onBreak() {
		System.out.println("Not allowed.");	
		
	}

	@Override
	public void onEndGame() {
		System.out.println("Currently on end game state.");
	}
	
}
