package jhansipractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Basicdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf =new SimpleDateFormat("M//d//yyyy");
				System.out.println(sdf.format(d));
				
				//Date class will give standardized Date format, d is an object so we have to convert it into string, so thats why used .toString()
				//SimpleDataFormat is used to customize dates
				//M,d,yyyy are data format, we can get more from internet
	}

}
