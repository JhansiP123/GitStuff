package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P1 {
@Parameters({"url"})
@BeforeMethod(groups= {"Smoke"})
public void jhans(String j) {
System.out.println(j);
}
@Test(groups= {"Smoke"})
public void jhansi() {
System.out.println("Priya");
}
@Test(groups= {"Smoke"})
public void jhansii() {
System.out.println("Karanki");
}
}
