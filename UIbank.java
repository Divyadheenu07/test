package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIbank {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("divya");
		driver.findElement(By.xpath("//option[text()='Ms']")).click();
		driver.findElement(By.id("middleName")).sendKeys("a");
		driver.findElement(By.id("lastName")).sendKeys("dheenu");
		driver.findElement(By.xpath("//option[text()='Female']")).click();
		driver.findElement(By.xpath("//option[text()='Unemployed']")).click();
		driver.findElement(By.id("username")).sendKeys("divya");
		driver.findElement(By.id("email")).sendKeys("divyadheenu1627@gmail.com");
		driver.findElement(By.id("password")).sendKeys("9710492244");
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
}
}