package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.tamilmatrimony.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.xpath("//option[@value='1']")).click();
	driver.findElement(By.id("NAME")).sendKeys("DIVYA");
	
	WebElement radio1=driver.findElement(By.xpath("//input[@value='F']"));
	radio1.click();
	driver.findElement(By.xpath("//option[text() ='7']")).click();
	driver.findElement(By.xpath("//option[text()='May']")).click();
	driver.findElement(By.xpath("//option[text()='2001']")).click();
	driver.findElement(By.xpath("//option[text()='Hindu']")).click();
	driver.findElement(By.xpath("//option[text()='Tamil']")).click();
	driver.findElement(By.xpath("//option[text()='India']")).click();
	driver.findElement(By.id("MOBILENO")).sendKeys("9710492244");
	driver.findElement(By.id("EMAIL")).sendKeys("divyadheenu1627@gmail.com");
	Thread.sleep(2000);
	driver.close();
	
}
	
	
}
