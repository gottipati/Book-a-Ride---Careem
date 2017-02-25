import java.util.*;
import java.lang.*;
import java.io.*;

public class Payment implements Command {
	Cab cab;
	User user;
	Payment pay;

	public Payment(Cab cab, User user, Payment pay) {
		this.cab = cab;
		this.user = user;
		this.pay = pay;
	}

	public void run() {
		if (cab.isBooked(cab.getId(), user.getId())) {
			pay.processPayment(cab.getId(), user.getId(), pay);
		}
	}

}