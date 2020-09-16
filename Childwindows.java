import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindows {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/namratha/Downloads/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		 driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
		 System.out.println(driver.getCurrentUrl());
		 Thread.sleep(2000);
		 //has all pages visited by the driver - signup(1), terms(2)
		 Set<String> ids = driver.getWindowHandles();
		 //to move to next pages itertor used
		 Iterator<String> it = ids.iterator(); //it=0
		 String parent = it.next();
		 String child = it.next();
		 driver.switchTo().window(child); //switch driver to child window
		 System.out.println(driver.getCurrentUrl());
		 driver.findElement(By.xpath("//a[contains(text(),'Archived versions')]")).click();
		 
	}

}
