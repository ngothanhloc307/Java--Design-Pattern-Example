package Facade;

public class NetworkAccessFacade {
	
	private Comm comm = new Comm();
	private Cache cache = new Cache();
	private Inteceptor inteceptor = new Inteceptor();
	private Convertor conv = new Convertor();
	
	public void comunicate() {
		cache.cache();
		comm.send("Some data");
		comm.receive();
		inteceptor.intercept();
		conv.convert();
	}
}
