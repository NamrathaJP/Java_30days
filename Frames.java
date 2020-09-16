import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/namratha/Downloads/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 Thread.sleep(2000);
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		 WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
		 Actions act = new Actions(driver);
		 act.dragAndDrop(source, destination).build().perform();
	}

}
