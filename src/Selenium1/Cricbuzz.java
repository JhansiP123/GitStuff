package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.qaclickacademy.com/practice.php");
		WebElement W =d.findElement(By.xpath("//table[@id='product']"));
		System.out.println(W.findElements(By.xpath("//table[@id='product']/tbody/tr")).size());
		System.out.println(W.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size());
		System.out.println(W.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td")).getText());
		System.out.println(W.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td[2]")).getText());
		System.out.println(W.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td[3]")).getText());
		}

}
