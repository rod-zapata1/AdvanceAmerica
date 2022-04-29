package AdvanceTest.AdvanceTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BaseClass {
	
	WebDriver driver;
	
	
	public static void loanLabel(WebDriver driver) {
		driver.findElement(By.cssSelector("li[class='mega flex'] a[href='/loans']")).click();
		String loanTitle = driver.findElement(By.cssSelector("h1.h2")).getText();
		Assert.assertEquals(loanTitle,"Advance America Loans");
	}
	
	public static void change_location(WebDriver driver) {
		driver.findElement(By.cssSelector("a[href='#']")).click();
	}
	
	public static void enter_zipCode(WebDriver driver, String zipcode) {
		driver.findElement(By.cssSelector("input#geolocator-location")).sendKeys(zipcode);
		driver.findElement(By.cssSelector("input[class='btn btn-primary']")).click();
	}
	
	public static void invalid_ZipCode(WebDriver driver) {
		String invalidZip = driver.findElement(By.xpath("//div[@class='alternate-offer']/child::p[1]")).getText();
		Assert.assertEquals(invalidZip ,"Great news! Advance America is partnered with Fortuna Credit in your state. Compare loan options up to $25,000.");
		
	}
	
	public static void stateName(WebDriver driver, String actualStateName) {
		String expectedStateName = driver.findElement(By.cssSelector("div[class='h2 visitor-location hide-when-form-shown force-show']")).getText();
		Assert.assertEquals(expectedStateName, actualStateName);
	}
	
	public static void closeDriver(WebDriver driver) {
		driver.close();
	}
	
	



}
