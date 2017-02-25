import java.util.*;
import java.lang.*;
import java.io.*;


public class BookCab implements Command {
	Cab cab;
	User user;

	public BookCab (Cab cab, User user) {
		this.cab = cab;
		this.user = user;
	}

	public void run() {
		cab.bookCab(cab.getId(), user.getId());
	}
}