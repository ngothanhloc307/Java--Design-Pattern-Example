package AbstractFactory;

public class ClientTest {
	public static void main(String[] args) {
		Client client1 = new Client(new DatabaseFactory());
		client1.comunicate();
		
		Client client2 = new Client(new NetworkFactory());
		client2.comunicate();
	}
}
