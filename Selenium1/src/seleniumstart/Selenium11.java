package seleniumstart;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;


//import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//C:\Users\ADMIN\Documents\Downloads\chromedriver-win64\chromedriver-win64
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\Downloads\\chromedriver-win64\\chromedriver-win64");

		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		
driver.manage().window().maximize();
driver.get("https://www.flipkart.com");

	String title=driver.getTitle()	;
	System.out.println(title);
		//driver.close();
		//driver.quit();
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());		
		Thread.sleep(2000);
		driver.navigate().forward();
		

	}

}
