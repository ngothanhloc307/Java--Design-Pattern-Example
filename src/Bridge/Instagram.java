package Bridge;

public class Instagram implements App {

	private PhoneOS os;
	
	public Instagram(PhoneOS os) {
		this.os = os;
	}
	
	@Override
	public void runApp() {
		System.out.println();
		os.upload("Instagram cache data");
		os.download("instagram.com");
		os.display("instagram data");
		os.display("fresh data");
		System.out.println();
		
	}

}
