package Singeltone;

public class SingeltoneLazyThreadSafeTest {

	public static void main(String[] args) {
		SingeltoneLazyThreadSafe lazyInstance1 = SingeltoneLazyThreadSafe.getInstance();
		SingeltoneLazyThreadSafe lazyInstance2 = SingeltoneLazyThreadSafe.getInstance();
		
		System.out.println(lazyInstance1);
		System.out.println(lazyInstance2);
	}

}
