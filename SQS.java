import java.util.*;
import java.lang.*;
import java.io.*;

public class SQS { 
	// We can create multiple queues of requests for different purposes. Here I can just creating one for book a cab.
	Queue<Command> queue;

	public SQS() {
		queue = new LinkedList<Command>();
	}
	public void addCommand (Command command) {
		queue.add(command);
	}
	public void execute() {
		Iterator<Command> it = queue.iterator();
		while(it.hasNext()) {
			Command command = it.next();
			command.run();
		}
	}

}
