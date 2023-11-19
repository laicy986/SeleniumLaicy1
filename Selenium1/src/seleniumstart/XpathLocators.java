package seleniumstart;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("obsqura24@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mypassword");
		driver.findElement(By.xpath("//*[@value='Log in']")).click();
		driver.findElement(By.xpath("(//div[@class='listbox'])[1]//li[4]//a")).click();

		List<WebElement> list = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
		System.out.println(list.size());

		for(int i =0;i<list.size();i++) {
			if(list.get(i).getText().equals("Blue Jeans")) {
				list.get(i).click();
				break;	
			}		
		}



		



	}

}
	