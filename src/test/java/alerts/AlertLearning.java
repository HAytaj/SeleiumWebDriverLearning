package alerts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertLearning {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MSI/Desktop/Learn%20testing/Selenium/alerts.html");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		/*driver.findElement(By.xpath("//button[text()='Standard Alert']")).click();
		driver.switchTo().alert();
		
		Thread.sleep(1000);
				
		driver.switchTo().alert().accept();
		
		//Confirm Alert
		driver.findElement(By.xpath("//button[text()='Confirm Alert']")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Confirm Alert']")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().dismiss();
		*/
		
		/*Thread.sleep(1000);
		
		driver.quit();
		
		driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Aytac Nömrə №1!");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Aytac Nömrə №1!");
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Custom Modal']")).click();
		Thread.sleep(2000);
		
		if(driver.findElement(By.xpath("//button[@class='close-btn']")).isDisplayed())
			driver.findElement(By.xpath("//button[@class='close-btn']")).click();
		*/
		
		driver.findElement(By.xpath("//a[@id='auth-link']")).click();
		Set<String> windows = driver.getWindowHandles();
		List<String> windowList = new ArrayList(windows);
		driver.switchTo().window(windowList.get(1));
		
		if(driver.getCurrentUrl().contains("https://httpbin.org/basic-auth/user/passwd")) {
			driver.get("https://user:passwd@httpbin.org/basic-auth/user/passwd");
		}
		
		driver.get("https://user:passwd@httpbin.org/basic-auth/user/passwd");
	}

}
