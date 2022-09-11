package baba.test.webui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	
	WebDriver driver;
	
	
	@BeforeTest
	public void initializeDriver() {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void registrationTest() throws InterruptedException {
		driver.navigate().to("https://fego.vmos-demo.com/");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("fego.vmos-demo.com"));
		Thread.sleep(10000L);
		
	}

}
