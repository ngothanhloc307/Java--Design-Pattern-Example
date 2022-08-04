package Flyweight;

import java.util.Random;

public class Client {

	public static void main(String[] args) {
		int toDraw = 10;
		Army army = new Army();
		FighterRank currentRank;
		Random random = new Random();
		
		for(int i = 0; i < toDraw; i++) {
			switch (random.nextInt(3)){
			case 0: currentRank = FighterRank.PRIVATE;
				break;
			case 1: currentRank = FighterRank.SERGEANT;
				break;
			default : currentRank = FighterRank.SERGEANT;
				break;
			}
			army.spawnFighter(currentRank);
		}

		army.drawArmy();
	}
}
