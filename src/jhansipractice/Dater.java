package jhansipractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Dater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
SimpleDateFormat sd = new SimpleDateFormat("EEEE");
SimpleDateFormat sdr = new SimpleDateFormat("dd//MM//YYYY");
Calendar c = Calendar.getInstance();
String day = sd.format(d);
String date = sdr.format(d);
System.out.println("Current day is" + " " + day);
System.out.println("Current Date is" + " " + date);

if(day.equals("Wednesday")) {
	c.add(Calendar.DATE, 2);
		
	System.out.println("Date after two days is" + "\t" +sdr.format(c.getTime()));
}
else if(day.equals("Tuesday")){
	c.add(Calendar.DATE, 1);
	
	System.out.println("Date after two days is" + sdr.format(c.getTime()));
}
else {
	System.out.println("Day is not Wednesday and Tuesday");
}
	}

}
