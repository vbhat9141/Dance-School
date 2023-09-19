package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dance_school {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:3000/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/login/register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("Shriram");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("bhatvishal30609@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("8275379085");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Vishal30609");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("Vishal30609");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='gender'and @id='male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("dob")).sendKeys("01-05-1996");
		Thread.sleep(2000);
		driver.findElement(By.id("accept")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='signUp']")).click();

	}

}
