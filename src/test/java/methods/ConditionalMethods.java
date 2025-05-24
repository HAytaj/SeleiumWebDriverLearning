package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		

		boolean emailExist = driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
		boolean isTextDateEnabled = driver.findElement(By.xpath("//input[@id='txtDate' and @name='SelectedDate']")).isEnabled();
		
		Thread.sleep(2000);
	

	}

}
