package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
WebDriver d=new ChromeDriver(); 
d.get("https://www.spicejet.com");
d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
boolean i=d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected();
System.out.println(i);
System.out.println(d.findElements(By.xpath("//input[@type='radio']")).size());
	}

}
