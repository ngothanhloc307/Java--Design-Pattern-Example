package Command;

public class OrderExecuteCommand implements Command{
	
	int id;
	
	public OrderExecuteCommand(int id) {
		this.id = id;
	}

	@Override
	public void excute() {
		System.out.println("Order " +  id + " executed" );
		
	}
	
	
	
}
