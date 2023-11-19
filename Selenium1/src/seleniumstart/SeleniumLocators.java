package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		//using ID locator here
		
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");

//using name locator
//driver.findElement(By.name("password")).sendKeys("secret_sauce");

//using class locator
driver.findElement(By.className("submit-button")).click();

driver.findElement(By.id("react-burger-menu-btn")).click();

Thread.sleep(2000);
//using LinkText locator you need to write text with linkText
driver.findElement(By.linkText("About")).click();
driver.navigate().back();

driver.findElement(By.id("react-burger-menu-btn")).click();
Thread.sleep(2000);
//using PartialLinkText locator here also write the partial Text that is Logo
	driver.findElement(By.partialLinkText("Logou")).click();

		driver.quit();

	}

}
