import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/namratha/Downloads/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 System.out.println(driver.findElements(By.tagName("a")).size());
		 List<WebElement> a = driver.findElements(By.xpath("//div[@id='gf-BIG']//td[1]//ul//li//a"));
		 for (int i=0; i<a.size();i++) {
		
			driver.findElements(By.xpath("//div[@id='gf-BIG']//td[1]//ul//li//a")).get(i).click();
			Set<String> wh1 = driver.getWindowHandles();
			Iterator<String> wh2 = wh1.iterator();
			String childid = wh2.next();
			driver.switchTo().window(childid);
			driver.navigate().back();
		 
		}
		 
		 
	}

}
