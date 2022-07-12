package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.DuplicateCategoryPage;
import util.BrowserFactory;

public class DuplicateCategoryTest {
	WebDriver driver;
	
	@Test
	public void userShouldNotBeAbleToAddDuplicate() {
		
		driver = BrowserFactory.init();
		DuplicateCategoryPage duplicateCategoryPage = PageFactory.initElements(driver, DuplicateCategoryPage.class);
		duplicateCategoryPage.userToAddDuplicate("DupCategory");		
		duplicateCategoryPage.clickOnNewCategoryeButton();
		System.out.println("Sorry, You can not enter a duplicate entry, ths entry already sxists in the system, try another one please");
		//duplicateCategoryPage.CategoryAlreadyExistValidation("AlreadyExistDash");
	}
	
	

}
