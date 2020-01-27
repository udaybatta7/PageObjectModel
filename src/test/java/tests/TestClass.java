package tests;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	@Test
	public void launchGoogle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void launchOutLook() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
	}
	@Test
	public void launchfaceBook() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
