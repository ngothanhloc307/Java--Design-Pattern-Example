package Singeltone;

public class SingeltoneBillPughTest {

	public static void main(String[] args) {
		SingeltoneBillPugh lazyInstance1 = SingeltoneBillPugh.getInstance();
		SingeltoneBillPugh lazyInstance2 = SingeltoneBillPugh.getInstance();
		
		System.out.println(lazyInstance1);
		System.out.println(lazyInstance2);

	}

}
