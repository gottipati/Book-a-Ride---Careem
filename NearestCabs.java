import java.util.*;
import java.lang.*;
import java.io.*;

public class NearestCabs implements Command {
	Location location;
	GPS gps;


	public NearestCabs(Location location, GPS gps) {
		this.location = location;
		this.gps = gps;
	}

	public void run() {
		gps.findNearestCabs(location);
	}

}