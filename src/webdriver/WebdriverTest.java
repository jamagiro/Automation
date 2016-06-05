package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new FirefoxDriver();
		
		String baseURL = "http://gooogle.com";
        driver.get(baseURL);
		
	}

}
