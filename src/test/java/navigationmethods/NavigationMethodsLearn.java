package navigationmethods;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationMethodsLearn {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.navigate().to("https://instagram.com/");

		
		driver.navigate().to("https://facebook.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl()); //https://instagram.com
		
		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl()); // https://facebook.com/
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();

	}

}
