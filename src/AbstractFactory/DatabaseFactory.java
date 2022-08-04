package AbstractFactory;

public class DatabaseFactory implements DataSourceAbstractFactory{

	@Override
	public Service createService() {
		
		return new DatabaseService();
	}

	@Override
	public Response creResponse() {
		return new DatabaseResponse();
	}

}
