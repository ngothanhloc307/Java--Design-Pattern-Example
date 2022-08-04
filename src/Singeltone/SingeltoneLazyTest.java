package Singeltone;

public class SingeltoneLazyTest {

	public static void main(String[] args) {
		SingeltoneLazy lazyInstance1 = SingeltoneLazy.getInstance();
		SingeltoneLazy lazyInstance2 = SingeltoneLazy.getInstance();
		
		System.out.println(lazyInstance1);
		System.out.println(lazyInstance2);

	}

}
