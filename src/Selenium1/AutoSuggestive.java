package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
WebDriver d=new ChromeDriver(); 
d.get("https://www.apsrtconline.in");
d.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("HYD");
d.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
d.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ENTER);
d.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys("Ava");
d.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys(Keys.ARROW_DOWN);
d.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys(Keys.DOWN);
d.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys(Keys.DOWN);
d.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys(Keys.ENTER);




	}

}
