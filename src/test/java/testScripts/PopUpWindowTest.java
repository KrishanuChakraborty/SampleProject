package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindowTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		String ParentWin = driver.getWindowHandle();
		System.out.println("Parent Hanlde.."+ParentWin);
		driver.findElement(By.xpath("//button[contains(text(),'new Tab')]")).click();
		
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("No of Window Handles.."+tabs.size());
		
		for (String child:tabs) {
			System.out.println(child);
			if(!child.equalsIgnoreCase(ParentWin)) {
				driver.switchTo().window(child);
				Thread.sleep(10000);
				//driver.findElement(By.xpath("(//span[@class='menu-text'])[2]")).click();
			}
		}
		driver.close();
		driver.switchTo().window(ParentWin);
		driver.findElement(By.xpath("//button[contains(text(),'new Window')]")).click();
//		driver.close();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.selenium.dev/");
		driver.quit();
	}

}
