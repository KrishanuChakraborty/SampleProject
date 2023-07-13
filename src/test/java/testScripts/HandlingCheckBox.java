package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		//Check Box Handling
		
		WebElement checkRadio = driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
		if (!checkRadio.isSelected()) {
			checkRadio.click();
			System.out.println("checkRadio clicked");
		}
		

		
		
	}

}
