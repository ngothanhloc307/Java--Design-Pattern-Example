package Facade;

public class Client {

	public static void main(String[] args) {
		NetworkAccessFacade access = new NetworkAccessFacade();
		access.comunicate();

	}

}
