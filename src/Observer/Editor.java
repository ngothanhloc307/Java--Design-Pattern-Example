package Observer;

public class Editor {
	
	public EventManager events = new EventManager("open", "save");
	String file = "";
	
	
	void openFile(String finename) {
		this.file = finename;
		events.notify("open", file);
	}
	
	void saveFile() {
		if(file != "") {
			events.notify("save", file);
		}
	}
	
}
