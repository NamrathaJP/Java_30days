import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.setProperty("webdriver.chrome.driver", "/Users/namratha/Downloads/chromedriver");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://login.salesforce.com/?locale=in");
	 driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("abcd");
	 driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("pwd");
	 driver.findElement(By.xpath("//*[@id=\'Login\']")).click();

	}

}
