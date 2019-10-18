package jhansipractice;


import java.io.IOException;

public class String1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Jhansi Priya");
		StringBuffer sb1=new StringBuffer("Karanki");
		sb.delete(7, 12);
		sb.append(sb1);
		System.out.println(sb);
		
	}

}
