package Command;

import java.util.*;

public class CommandProcessor {
	
	List<Command> commands = new ArrayList<>();
	
	public CommandProcessor addCommand(Command command) {
		commands.add(command);
		return this;
	}

	public void execute() {
		for(Command command: commands) {
			command.excute();
		}
	}
}
