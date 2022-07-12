package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.ValidateMonthDropDownPage;
import util.BrowserFactory;

public class ValidateMonthDropDownTest {
	WebDriver driver;
	@Test
	public void VerifyDropDown() {
      driver = BrowserFactory.init();
			
	ValidateMonthDropDownPage validateMonthDropDownPage =  PageFactory.initElements(driver, ValidateMonthDropDownPage.class);
	validateMonthDropDownPage.VerifyTest1();
	}

}
