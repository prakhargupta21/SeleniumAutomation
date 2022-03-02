package revision;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learning {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en");
		System.out.println("title of web page is:"+driver.getTitle());
		System.out.println("URL of web page is:"+driver.getCurrentUrl());
		System.out.println("page source is:"+driver.getPageSource()); 
		driver.close();
		
	}

}
