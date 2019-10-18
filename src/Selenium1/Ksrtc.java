package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ksrtc {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://ksrtc.in/oprs-web/guest/home.do");
		d.findElement(By.cssSelector("#fromPlaceName")).click();
		d.findElement(By.cssSelector("#fromPlaceName")).sendKeys("vijaya");
		
	//	d.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		d.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.ENTER);
	}

}
