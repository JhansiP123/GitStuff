package Selenium1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		WebDriverWait  w= new WebDriverWait(d,10);
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] names = { "Nuts Mixture", "Cashews", "Walnuts" };
		int j = names.length;
		List<WebElement> W = d.findElements(By.xpath("//h4[@class='product-name']"));
		int l = W.size();
		int g = 0;
		List<String> itemsNeededList = Arrays.asList(names);
		for (int i = 0; i < l; i++) {

			String s1 = d.findElements(By.xpath("//h4[@class='product-name']")).get(i).getText();
			
		
			if (itemsNeededList.contains(s1)) {
				g++;
				d.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (g == j) {

					break;
				}
				
			}
			
		}
	}

}
