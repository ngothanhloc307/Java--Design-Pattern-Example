package Observer;

public class Client {
	public static void main(String[] args) {
		Editor editor = new Editor();
		EmailNotificationListener emailListener = new EmailNotificationListener();
		LogOpenListener loglistener = new LogOpenListener();
		
		editor.events.subcribe("open", emailListener);
		editor.events.subcribe("save", emailListener);
		editor.events.subcribe("open", loglistener);
		
		editor.openFile("test.jpg");
		editor.saveFile();
		
		System.out.println("\n------------------------------------------------------");
		
		editor.events.unsubcribe("save", emailListener);
		
		editor.openFile("test.jpg");
		editor.saveFile();
		
	}
}
