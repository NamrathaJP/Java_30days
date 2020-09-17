import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/namratha/Downloads/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 Thread.sleep(2000);
		 new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))).click();
		 driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Chennai (MAA)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		 Select adult = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		 adult.selectByValue("2");
		 Select child = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
		 child.selectByValue("1");
		 Select infant = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']")));
		 infant.selectByValue("1");
		 Thread.sleep(1000);
		 List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\'familyandfriend\']/label")).click();
		 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		 driver.switchTo().alert().accept();
		 driver.findElement(By.xpath("//*[@id=\'familyandfriend\']/label")).click();
		 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		 
	}
	}


