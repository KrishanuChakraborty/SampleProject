package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		//driver.findElement(By.xpath("//id="APjFqb"))
		//  "//input[@id='name']//following::input[2]" // following
		// "//input[@id='name']//preceding::input[2]" // preceding
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Java tutorial");
		Thread.sleep(2000);
		List<WebElement> items = driver.findElements(By.xpath(
				"(//ul[@class='G43f7e'])[1]//li//descendant::div[@class='wM6W7d']"));
		System.out.print("No of items =" +items.size());
		for (int i=0;i<items.size();i++) {
			System.out.println(items.get(i).getText());
			if (items.get(i).getText().equalsIgnoreCase("Java tutorial pdf")) {
				break;
			}
		}
	}

}
