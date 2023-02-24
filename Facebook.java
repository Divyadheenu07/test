package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("divya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("dheenu");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9710492244");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("00000");
		driver.findElement(By.xpath("//option[text()='7']")).click();
		driver.findElement(By.xpath("//option[text()='May']")).click();
		driver.findElement(By.xpath("//option[text()='2001']")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		boolean isenable=true;
		driver.close();
	}

}
