package Observer;

public class EmailNotificationListener implements EventListener {

	@Override
	public void notify(String eventType, String file) {
		System.out.println("EmailNotificationListener: " + eventType + " perfomed on file: " + file);
		
	}

	
}
