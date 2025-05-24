package LocatorsLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("file:///C:/Users/MSI/Desktop/Learn%20testing/Selenium/webpage.html");
		
		
		driver.manage().window().maximize(); // bunu yaziriq ki, browser max olsun, kicik olanda bezi elementler itir
		
		//tag id tag#id
		//driver.findElement(By.cssSelector("input#login-username")).sendKeys("user1234");
		driver.findElement(By.cssSelector("#login-username")).sendKeys("user1234"); //mutleq # yazilir
		
		//tag classname tag.classname
		if(driver.findElement(By.cssSelector("div#image-section.section")).isDisplayed()) {
			System.out.println("Image Section Displayed - Passed"); // class name uzun olduqda bosluqdan sonrani sil, yoxsa kesilir ve element tapilmir da
		} 
		// tag bosluq atrribute tag [attribute=\"value\"] tag [attribute='value']  [attribute=\"value\"] - tekce atribut yazsan da, olar
		System.out.println(driver.findElement(By.cssSelector("select [value='js']")).getText());
		System.out.println(driver.findElement(By.cssSelector("select [value=\"js\"]")).getText());
		System.out.println(driver.findElement(By.cssSelector("[value=\"js\"]")).getText());
		
		// tag bosluq classname atrribute tag.classname [attribute=\"value\"] tag [attribute='value'] 
		System.out.println(driver.findElement(By.cssSelector("select#language [value='java']")).getText());
		System.out.println(driver.findElement(By.cssSelector("select#language option[value='java']")).getText());
		
		driver.quit();

	}

}
