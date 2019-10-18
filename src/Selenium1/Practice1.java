package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.qaclickacademy.com/practice.php");
		d.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String s = d.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(s);
		Select s1 = new Select(d.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		s1.selectByVisibleText(s);
		d.findElement(By.xpath("//input[@id='name']")).sendKeys(s);
		d.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String a = d.switchTo().alert().getText();
		if (a.contains(s)) {
			System.out.println("Success");
			d.switchTo().alert().accept();
		}

	}

}
