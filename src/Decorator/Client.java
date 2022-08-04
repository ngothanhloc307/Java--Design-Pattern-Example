package Decorator;

public class Client {
	
	public static void main(String[] args) {
		NormalCoffeeMachine normal = new NormalCoffeeMachine();
		EnhancedCoffeeMachine enhanced = new EnhancedCoffeeMachine(normal);
		
		normal.makeLargeCoffe();
		normal.makeLargeCoffe();
		enhanced.makeSmallCoffe();
		enhanced.makeLargeCoffe();
		enhanced.makeMilkCoffee();
	}
	
	
}
