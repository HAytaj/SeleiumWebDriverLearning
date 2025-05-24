package LocatorsLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/MSI/Desktop/Learn%20testing/Selenium/webpage.html");
		
		driver.manage().window().maximize();
		
		//select name
		driver.findElement(By.name("username")).sendKeys("Aytac");
		
		
		//select id
		boolean isImgExists = driver.findElement(By.id("placeholder_img")).isDisplayed();
		
		if(isImgExists == true) {
			System.out.println("Image test passed");
		}
		
		else {
			System.out.println("Image test failed");
		}
		
		
		//link text
		driver.findElement(By.linkText("Go to Site")).click(); //go to the link by clicking-always use this
		driver.findElement(By.partialLinkText("Example")).click(); //go to the link by clicking
		
		
		/*Notes
		 * 
		 * id, name, partialLinkText, linkText shifədə ancaq 1 o ad/text/id varsa, işlədilir, gruplar üçün yox
		 * tagName, class - gruplar üçündü
		 * 
		 * */
		
		List<WebElement> sections = driver.findElements(By.className("section"));
		
		System.out.println("# of sections in the webpage: " + sections.size());
		
		System.out.println("# of input tags: " + driver.findElements(By.tagName("input")).size());
		
		System.out.println("# of input imgs: " + driver.findElements(By.tagName("img")).size());
		
		System.out.println("# of nihahah test: " + driver.findElements(By.tagName("nihahah")).size());
		
		System.out.println("# of nihahah test2: " + driver.findElement(By.name("nihahah")));
		//driver.quit();

	}

}
