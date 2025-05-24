package XPathLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class XPathWork {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/MSI/Desktop/Learn%20testing/Selenium/webpage.html");
		
		driver.manage().window().maximize();
		
		
		//xpath with single attribute
		driver.findElement(By.xpath("//*[@id=\"search-box\"]")).sendKeys("Salam!");
		
		
		//xpath with and or attribute
		driver.findElement(By.xpath("//*[@placeholder='Search...'or @name='searchBox']")).sendKeys("Fuck you");
		driver.findElement(By.xpath("//*[@placeholder='Search...' and @name='searchBox']")).sendKeys("Hellosh");
		
		//xpath with multiple attribute
		driver.findElement(By.xpath("//*[@placeholder='Search...'][@name='searchBox']")).sendKeys("Nihahaha");

		//xpath with innertext/linktext
		System.out.print(driver.findElement(By.xpath("//*[text()='Links']")).getText());
		
		driver.findElement(By.xpath("//button[@onclick='showAlert()']")).click();
		//driver.quit();
		
		

	}

}
