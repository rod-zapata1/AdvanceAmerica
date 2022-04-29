package AdvanceTest.AdvanceTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDriver{
	
	public CreateDriver(){

	}
	
	public WebDriver setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rzapata/Desktop/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.advanceamerica.net/");
		driver.manage().window().maximize();  
		return driver;
//
	}

}