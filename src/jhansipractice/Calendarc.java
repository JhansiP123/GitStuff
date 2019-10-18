package jhansipractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendarc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar c =Calendar.getInstance();
SimpleDateFormat ds = new SimpleDateFormat("M//d//yyyy");
System.out.println(ds.format(c.getTime()));
System.out.println(c.get(Calendar.AM_PM)); 

// The main difference between calendar class and Date class is in calendar calss we'll get too many methods for Dates customizing 

	}

}
