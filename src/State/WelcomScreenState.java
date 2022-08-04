package State;

public class WelcomScreenState extends State{
	
	public WelcomScreenState(Game game) {
		super(game);
		System.out.println("--Game Welcome Screen State---");
	}

	@Override
	public void onWelcomeScreen() {
		System.out.println("Currently on welcome screen");
	}

	@Override
	public void onPlaying() {
		game.changeState(new PlayingState(game));
	}

	@Override
	public void onBreak() {
		System.out.println("Not allowed.");
		
	}

	@Override
	public void onEndGame() {
		System.out.println("Not allowed.");
	}
}
