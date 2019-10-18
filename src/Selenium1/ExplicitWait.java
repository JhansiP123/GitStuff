package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(d, 10);
		d.get("https://www.amazon.in/");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-link-accountList']")));
		System.out.println(d.findElement(By.xpath("//a[@id='nav-link-accountList']")).getText());
		//Example
		d.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		d.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		System.out.println(d.findElement(By.xpath("//div[@id='results']")).getText());
		
	}

}
