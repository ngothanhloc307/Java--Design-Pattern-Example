package Singeltone;

public class SingeltoneLazy {

	private static SingeltoneLazy lazyInstance;
	
	private SingeltoneLazy() {
		
	}
	
	public static SingeltoneLazy getInstance() {
		if(lazyInstance == null) {
			lazyInstance = new SingeltoneLazy();
		}
		
		return lazyInstance;
	}
}
