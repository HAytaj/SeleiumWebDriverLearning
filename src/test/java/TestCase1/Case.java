package TestCase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Case {

	public static void main(String[] args) {
		
		/* Launch Driver */
		//ChromeDriver chromeDriver = new ChromeDriver();
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		// Which web application/web site ?
		
		driver.get("https://mvnrepository.com/");
		
		
		// Testing web page title
		
		String title = driver.getTitle();
		
		if(title.toLowerCase().contains("maven repository")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		//driver.close(); // bu nese exception atir
		driver.quit();
	}

}
