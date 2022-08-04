package Decorator;

public class NormalCoffeeMachine implements CoffeeMachine{

	@Override
	public void makeSmallCoffe() {
		System.out.println("Normal coffee machine: Making small coffee");
		
	}

	@Override
	public void makeLargeCoffe() {
		System.out.println("Normail coffee machine: Making large coffee");
	}

}
