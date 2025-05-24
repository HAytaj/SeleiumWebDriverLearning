package methods;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethodsExplicit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	    driver.get("file:///C:/Users/MSI/Desktop/Learn%20testing/Selenium/webpage.html");
	    driver.manage().window().maximize();
	    
	    //neyi gozleyirik onu yaziriq
	   WebElement buttonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search-section\"]/button")));
	   buttonElement.click(); // daha burda element tapildi, bir de onu findElement etmeye ehtiyac yoxdu
	   
		

	}

}
