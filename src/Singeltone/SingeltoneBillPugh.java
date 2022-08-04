package Singeltone;

public class SingeltoneBillPugh {
	
	private SingeltoneBillPugh () {
		
	}
	
	private static class InnerStaticClass {
		private static final SingeltoneBillPugh billPughInstance = new SingeltoneBillPugh();
	}
	
	public static SingeltoneBillPugh getInstance() {
			return InnerStaticClass.billPughInstance;
	}
}
