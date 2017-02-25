import java.util.*;
import java.lang.*;
import java.io.*;

public class CancelCab implements Command{
	Cab cab;
	User user;

	public CancelCab(Cab cab, User user) {
		this.cab = cab;
		this.user = user;
	}

	public void run() {
		cab.cancelCab(cab.getId(), user.getId());
	}
}