package Decorator;

public class EnhancedCoffeeMachine implements CoffeeMachine{
	
	private NormalCoffeeMachine machine;
	
	public EnhancedCoffeeMachine(NormalCoffeeMachine machine) {
		this.machine = machine;
	}

	// Override behavior
	
	@Override
	public void makeSmallCoffe() {
		System.out.println("Enhanced coffee machine: Making small coffee");
	}
	
	// Unaltered behavior

	@Override
	public void makeLargeCoffe() {
		machine.makeLargeCoffe();
	}
	
	// Extended behavior
	
	public void makeMilkCoffee() {
		System.out.println("Enhanced coffee machine: Making milk coffee");
		machine.makeLargeCoffe();
		System.out.println("Enhanced coffee machine: Adding milk");
	}
	

}
