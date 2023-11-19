package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("laicy");
		driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys("thomas");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("la");
		driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("Mangalore");
		driver.findElement(By.xpath("//input[@placeholder='State']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@placeholder='Zip']")).sendKeys("574229");
		driver.findElement(By.xpath("//input[@id='invalidCheck']")).click();
		//driver.findElement(By.xpath("//button[@class='btn-primary']")).click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		Thread.sleep(2000);
		String text=driver.findElement(By.cssSelector(".btn-primary")).getText();

		System.out.println(text);

		
		//String text=driver.findElement(By.cssSelector("[class*='current-ite']")).getText();
		//System.out.println(text);


		
		//(By.xpath("//input[@type='password']"))
		

	}

}
