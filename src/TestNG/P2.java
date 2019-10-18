package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P2 {
/*@Test(dataProvider="jhansi")
public void jhans(String s, String j) {
System.out.println(s);
System.out.println(j);
}
@DataProvider
@Test()
public Object[][] jhansi() {
Object[][] a =new Object[3][2];
a[0][0]="jhansi";
a[0][1]="priya";
a[1][0]="jhansi1";
a[1][1]="priya1";
a[2][0]="jhansi2";
a[2][1]="priya2";
return a;
}*/
@Test()
public void data() throws IOException {
Properties p = new Properties();
FileInputStream f = new FileInputStream("C:\\Users\\jhansi.karanki\\eclipse-workspace\\jhansipractice\\src\\TestNG\\datadriven.properties");
p.load(f);	
System.out.println(p.getProperty("username"));
}
}
