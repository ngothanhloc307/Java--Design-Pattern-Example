package Singeltone;

public class SingeltoneLazyThreadSafe {
	
	private static SingeltoneLazyThreadSafe threadSafeInstance;
	
	private SingeltoneLazyThreadSafe() {
		
	}
	
	public static SingeltoneLazyThreadSafe getInstance() {
		synchronized (SingeltoneLazyThreadSafe.class) {
			if(threadSafeInstance == null) {
				threadSafeInstance = new SingeltoneLazyThreadSafe();
			}
			
		}
		return threadSafeInstance;
	} 

}
