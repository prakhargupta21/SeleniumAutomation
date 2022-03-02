package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		WebElement searchStore = driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
		 //isDisplayed() //isEnabled()
		System.out.println("Display Status:-" +searchStore.isDisplayed());
		System.out.println("Enable Status:-" +searchStore.isEnabled());	
		//isSelected()
	    WebElement male=driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
	   System.out.println("Selection Status:-"+male.isSelected());//false
	   male.click();
	   Thread.sleep(3000);
	   System.out.println("Selection Status:-"+male.isSelected());//true
	    
		driver.close();
	}

}
