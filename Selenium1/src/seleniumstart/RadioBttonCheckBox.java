package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class RadioBttonCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBox.click();
		
Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Radio Buttons Demo']")).click();
		WebElement radioBtn = driver.findElement(By.id("inlineRadio1"));
		radioBtn.click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[id='button-one']")).click();
Thread.sleep(5000);
		driver.quit();
	}

}
