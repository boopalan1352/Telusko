package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@class='input_password']")).sendKeys("asdf");
		
		driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		
		int size=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total Frames --" + size);
		
		Actions abc=new Actions(driver);
		abc.moveToElement(toElement, xOffset, yOffset);
		abc.keyDown(element, theKey)
		
	}

}
