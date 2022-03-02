package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVSFindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		searchbox.sendKeys("XYZ");
		Thread.sleep(3000);
		driver.close();

	}

}
