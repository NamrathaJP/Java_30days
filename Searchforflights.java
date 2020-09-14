import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searchforflights {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/namratha/Downloads/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 //driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))).click();
		 driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Chennai (MAA)']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		 driver.findElement(By.id("divpaxinfo")).click();
		 Select adults = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		 adults.selectByValue("2");
		 Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		 child.selectByIndex(1);
		 Select infant = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		 infant.selectByIndex(2);
		 Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 currency.selectByVisibleText("USD");
		 driver.findElement(By.xpath("//label[contains(text(),'Family and Friends')]")).click();
		 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		 
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//label[contains(text(),'Family and Friends')]")).click();
		 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		 
		 
		 
		

	}

}
