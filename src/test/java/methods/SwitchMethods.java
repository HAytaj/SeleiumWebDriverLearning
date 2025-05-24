package methods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[contains(@id,'wikipedia-search')]/child::a"));
		
		System.out.println("Number of links: " + links.size());
		
		for(WebElement we: links) {
			we.click();
			System.out.println(we.getText());
		}
		
		Set<String> driverIds = driver.getWindowHandles();
		
		List<String> windowIdList = new ArrayList<String>(driverIds);
		
		for(String id: windowIdList) {
			driver.switchTo().window(id);
			String pageTitle =  driver.getTitle();
			System.out.println(pageTitle);
			
			if(pageTitle.contains("Testosterone - Wikipedia")) {				
				driver.close();
				System.out.println("Testosterone - Wikipedia closed");
			}
		}
	}

}
