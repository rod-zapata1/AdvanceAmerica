package AdvanceTest.AdvanceTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Products_by_state {
	
	static WebDriver _driver;
	
	public Products_by_state(WebDriver driver) {
		_driver = driver;
	}
	
	public void tn_available() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) _driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		Thread.sleep(1000);
		
		String payday = _driver.findElement(By.cssSelector("h3[class='loan-title h3'] a[href='/loans/payday-loans']")).getText();
		boolean expectedPDL = payday.equals("Payday Loans");
		
		String loc = _driver.findElement(By.cssSelector("h3[class='loan-title h3'] a[href='/loans/line-of-credit']")).getText();
		//Assert.assertEquals(loc, "Line of Credit");
		boolean expectedLOC = loc.equals("Line of Credit");
		
		String tln = _driver.findElement(By.cssSelector("h3[class='loan-title h3'] a[href='/loans/title-loans']")).getText();
		boolean expectedTLP = tln.equals("Title Loans");
		
		js.executeScript("window.scrollBy(0,-600)", "");
	
		Assert.assertTrue(expectedPDL && expectedTLP && expectedLOC);
	
	}
	
	
	public void ok_available() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) _driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		Thread.sleep(1000);
		
		String ilp = _driver.findElement(By.cssSelector("h3[class='loan-title h3'] a[href='/loans/installment-loans']")).getText();
		Assert.assertEquals(ilp, "Installment Loans");
		
		js.executeScript("window.scrollBy(0,-600)", "");
	}

	

}
