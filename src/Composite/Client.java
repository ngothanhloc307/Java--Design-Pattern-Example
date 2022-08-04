package Composite;

public class Client {

	public static void main(String[] args) {
		Composite computer = new Composite("PC");
		Equipment processor = new Equipment("Processor", 1000);
		Equipment hdd = new Equipment("Hard driver", 500);
		Composite memory = new Composite("Memory");
		Equipment room = new Equipment("Read only memory", 75);
		Equipment ram = new Equipment("random access memory", 100);
		
		memory.add(room).add(ram);
		computer.add(processor).add(hdd).add(memory);
		
		System.out.println("PC price: " + computer.getPrice());
	}

}
