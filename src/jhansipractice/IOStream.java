package jhansipractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOStream {

	public static void main(String[] args) throws IOException{
Scanner S=new Scanner(System.in);
System.out.println("Enter the elements");
String St = S.next();
int s = S.nextInt();
float f = S.nextFloat();
System.out.println(St);
System.out.println(s);
System.out.println(f);
InputStreamReader io = new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(io);
String j=br.readLine();
int h = Integer.parseInt(br.readLine());
System.out.println(j);
System.out.println(h);
FileReader fo = new FileReader("C:\\Users\\jhansi.karanki\\Desktop\\T1.txt");
BufferedReader br1=new BufferedReader(fo);
String r=br1.readLine();
System.out.println(r);
	}

}
