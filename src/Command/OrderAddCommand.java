package Command;

public class OrderAddCommand implements Command{
	
	int id;
	double price;
	
	public OrderAddCommand(int id , double price) {
		this.id = id;
		this.price = price;
	}

	@Override
	public void excute() {
		System.out.println("Order " +  id+ "added with price " + price);
	}
	
	

}
