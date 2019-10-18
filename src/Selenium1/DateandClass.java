package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateandClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.path2usa.com/travel-companions");
		d.findElement(By.xpath("//input[@name='travel_date']")).click();
		WebElement w = d.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		while (!(w.getText().contains("April"))) {
			d.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		}
		int l = d.findElements(By.cssSelector(".day")).size();
		for (int i = 0; i < l; i++) {
			String s = d.findElements(By.cssSelector(".day")).get(i).getText();
			if (s.equalsIgnoreCase("23")) {

				d.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
//d.close();
	}
}
