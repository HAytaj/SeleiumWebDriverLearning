package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/MSI/Desktop/Learn%20testing/Selenium/webpage.html");
		
		driver.manage().window().maximize();
		

		driver.findElement(By.linkText("Go to Site")).click();
		
		Thread.sleep(2000);
				
		driver.close();
		driver.quit();
	}

}
