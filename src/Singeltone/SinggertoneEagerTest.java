package Singeltone;

public class SinggertoneEagerTest {

	public static void main(String[] args) {
		SingeltoneEager eagerInstance1 = SingeltoneEager.getEagerInstance();
		SingeltoneEager eagerInstance2 = SingeltoneEager.getEagerInstance();
		
		System.out.println(eagerInstance1);
		System.out.println(eagerInstance2);

	}

}
