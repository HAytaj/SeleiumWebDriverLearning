package methods;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/MSI/Desktop/Learn%20testing/Selenium/webpage.html");
		
		driver.manage().window().maximize();
				
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getPageSource());
		
		driver.findElement(By.linkText("Go to Site")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getWindowHandles());
	}

}
