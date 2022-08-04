package Mediator;

public class Client {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		ChatUser alice = new ChatUser("Alice", mediator);
		ChatUser peter = new ChatUser("Peter", mediator);
		ChatUser carol = new ChatUser("Carol", mediator);
		
		mediator.addUser(alice).addUser(carol).addUser(peter);
		
		carol.sendMessage("Hello everyone!");
		
	}
}
