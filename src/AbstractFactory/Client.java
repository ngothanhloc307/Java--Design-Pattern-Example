package AbstractFactory;

public class Client {
	
	private Service service;
	private Response response;
	
	public Client(DataSourceAbstractFactory factory) {
		service = factory.createService();
		response = factory.creResponse();
	}
	
	public void comunicate() {
		if(service != null && response != null) {
			System.out.println(service.runService());
			System.out.println(response.getResponse());
		}
	}

}
