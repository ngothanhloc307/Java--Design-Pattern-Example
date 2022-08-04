package Singeltone;

public class SingeltoneEager {
	
	private static SingeltoneEager eagerInstance = new SingeltoneEager();
	private SingeltoneEager() {
		
	}
	
	public static SingeltoneEager getEagerInstance() {
		return eagerInstance;
	}
	
	

}
