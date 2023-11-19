package seleniumstart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector(".email")).sendKeys("obsqura24@gmail.com");
		
		driver.findElement(By.cssSelector("#Password")).sendKeys("mypassword");
		// driver.findElement(By.cssSelector(".button-1.login-button")).click();

		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.cssSelector("[class='list'] li:nth-child(4) a")).click();

		String text=driver.findElement(By.cssSelector("[class*='current-ite']")).getText();
		System.out.println(text);

		driver.quit();

	}


	}


