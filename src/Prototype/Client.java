package Prototype;

public class Client {

	public static void main(String[] args) {
		Vehicle c1 = new Car(4, 30000, "blue");
		Vehicle c2 = c1.clone();
		
		System.out.println(c1);
		System.out.println(c2);
		
		c2.isClone(c1);
		c1.isClone(c2);
		
		Vehicle b1 = new Bicycle(2, 1000, true);
		Vehicle b2 = b1.clone();
		
		System.out.println(b1);
		System.out.println(b2);
		
		b2.isClone(b1);
		b1.isClone(b2);
		

	}

}
