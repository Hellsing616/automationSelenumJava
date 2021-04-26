package common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class TestRule {
	
	private static WebDriver driver;
	
	@Before
	public void beforeScenerios() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com.br/");
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
