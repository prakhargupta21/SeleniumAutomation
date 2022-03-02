package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PersonalAssesment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		Thread.sleep(3000);
		WebElement result = driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[1]/span"));
		Thread.sleep(3000);
		result.click();
		System.out.println("click status:"+result.isSelected());
		driver.close();

	}

}
