package seleniumstart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();

		List<WebElement> listofAddToCartBtn = driver.findElements(By.cssSelector(".btn_inventory "));
		System.out.println(listofAddToCartBtn.size());
//Here we have six elements so adding six elements with same class
		for(int i =0;i<listofAddToCartBtn.size();i++) {
			listofAddToCartBtn.get(i).click();
			Thread.sleep(1000);
			
			//for each loop
//			for(WebElement element : listofAddToCartBtn) {
				//element.click();
	}
		}

	}


