package xpathaxeslearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxes {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/MSI/Desktop/Learn%20testing/Selenium/xpathaxes.html");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//div[@data-role='manager']/self::div")).getText());	
		System.out.println(driver.findElement(By.xpath("//div[@class='member' and @data-role='designer']/parent::div")).getText());	
		System.out.println(driver.findElement(By.xpath("//body/div/div/p[contains(text(), 'sample')]")).getText());	
		System.out.println(driver.findElement(By.xpath("//a[@id='link3']/ancestor::ul")).getText());	
		System.out.println(driver.findElement(By.xpath("//a[@id='link3']/parent::li")).getText());	
		System.out.println(driver.findElement(By.xpath("//a[@id='link3']/parent::li/preceding::li/preceding::li")).getText());	
		System.out.println(driver.findElement(By.xpath("//div[@data-role='manager']/child::span[@class='role']")).getText());		
	}
}
