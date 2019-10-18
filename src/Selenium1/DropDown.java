package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
WebDriver d=new ChromeDriver(); 
d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
/*d.get("https://www.spicejet.com");
d.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
d.findElement(By.xpath("//a[@value='JLR']")).click();
d.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(),'Chennai (MAA)')]")).click();
//d.close(); //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(),'Chennai (MAA)')]*/
//Auto suggestive
d.get("https://www.makemytrip.com");
//d.findElement(By.xpath("//input[@id='fromCity']")).clear();
d.findElement(By.xpath("//input[@id='fromCity']")).clear();
//d.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Ban");


//d.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
d.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
d.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
//d.findElement(By.xpath("//input[@placeholder='From']")).click();
//d.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(Keys.ENTER);
//d.close();

	}

}
