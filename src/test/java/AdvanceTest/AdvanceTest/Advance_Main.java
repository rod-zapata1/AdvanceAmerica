package AdvanceTest.AdvanceTest;

import org.openqa.selenium.WebDriver;

public class Advance_Main extends BaseClass{
	

	public static void main(String[] args) throws InterruptedException{
		
		CreateDriver d = new CreateDriver();
		WebDriver driver = d.setUp();
		
		// Validate Advance America Loans screen is displayed
		loanLabel(driver); 
		
		// Enter a ZipCode outside of the US
		enter_zipCode(driver, "97302");
		
		// Validate wording of ZipCode outside of US
		invalid_ZipCode(driver); 
		
		// Click on change location option
		change_location(driver); 
		
		// Enter a ZipCode from Tennessee and validate correct label is displayed
		enter_zipCode(driver, "37010");
		stateName(driver, "Tennessee");
		
		// Validate Tennessee products are displayed
		Products_by_state products = new Products_by_state(driver);
		products.tn_available();
	
		// Click on change location option
		change_location(driver);
		
		// Enter a ZipCode from Oklahoma and validate correct label is displayed
		enter_zipCode(driver, "73101");
		stateName(driver, "Oklahoma");
		
		// Validate Oklahoma product is displayed
		products.ok_available();
		
		// Click on change location option
		change_location(driver);
		
		// Enter a ZipCode outside of the US
		enter_zipCode(driver, "97302");
		
		// Validate wording of ZipCode outside of US
		invalid_ZipCode(driver);
		
		// Close the driver
		closeDriver(driver);

	}
	
}
