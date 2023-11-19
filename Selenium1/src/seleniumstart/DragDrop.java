package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");

		Actions act = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		act.dragAndDrop(source, target).build().perform();

		driver.quit();
	}

}
