package AbstractFactory;

public class NetworkFactory implements DataSourceAbstractFactory{

	@Override
	public Service createService() {
		
		return new NetworkService();
	}

	@Override
	public Response creResponse() {
		
		return new NetworkResponse();
	}

}
