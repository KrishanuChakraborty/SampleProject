package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String strlbl = driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(strlbl);
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome Back");
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//label/span")).getText());
		

	}

}
