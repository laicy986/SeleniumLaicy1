package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;


public class Yathra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		
driver.manage().window().maximize();
driver.get("https://www.flipkart.com");

///Grab text present inside any element

String heading1 =driver.findElement(By.partialLinkText("Become a")).getText();
WebElement heading = driver.findElement(By.className("main-heading"));


//System.out.println(heading);	


//Grab any attribute value
		String attributeValue = driver.findElement(By.partialLinkText("Become a")).getAttribute("title");
		System.out.println("Attribute value== "+attributeValue);

		
		//Tool tip is nothing but title attribute value
				String toolTip = driver.findElement(By.partialLinkText("Become a")).getAttribute("title");
				System.out.println("ToolTip = "+toolTip);

				//grab any CSS value associated to WebElement
				
						//getCssValue("font-weight");
				//System.out.println(cssValue);

	}

}
