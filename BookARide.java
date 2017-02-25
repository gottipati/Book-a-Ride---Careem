import java.util.*;
import java.io.*;
import java.lang.*;

public class BookARide {

	GPS gps;
	Location location;
	User user;
	Command nearest;
	Command bookCab;
	Command payment;
	SQS sqs;

	public BookARide(GPS gps, Location location, User user, Command nearest, Command bookCab, Command payment, SQS sqs) {
		this.gps = gps;
		this.location = location;
		this.user = user;
		this.nearest = nearest;
		this.bookCab = bookCab;
		this.payment = payment;
		this.sqs = sqs;
	}

	public void bookARide() {
		sqs.addCommand(nearest);
		sqs.addCommand(bookCab);
		sqs.addCommand(payment);
		sqs.execute();
	}

}