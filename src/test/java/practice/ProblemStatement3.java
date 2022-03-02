package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProblemStatement3 {
	WebDriver driver;
	String serachText = "iphone";

	@BeforeTest
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

	}

	@Test
	public void signIn() throws Exception {
		WebElement ele = driver.findElement(By.xpath("(//a[contains(@class,'nav-a nav-a-2')])[3]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='nav-text']")).click();
		String expectedText = "Save time";
		String actualText = driver.findElement(By.xpath("//h3[text()='Save time']")).getText();

		// validation
		Assert.assertEquals(actualText, expectedText);
		// Assert.assertTrue(actualAppTitle.contains(serachText));

	}

	@AfterTest
	public void closeApp() {
		driver.close();
	}

}
