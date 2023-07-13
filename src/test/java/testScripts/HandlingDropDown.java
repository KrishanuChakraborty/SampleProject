package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Thread.sleep(2000);
		
		Select val= new Select(driver.findElement(By.id("select-demo")));
		val.selectByValue("Wednesday");
	}

}
