package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:3000/login");
		Thread.sleep(2000);
		driver.findElement(By.name("userEmail")).sendKeys("shrikant@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Shri@123");
		Thread.sleep(2000);
		driver.findElement(By.id("remember")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[.='LOGOUT']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
