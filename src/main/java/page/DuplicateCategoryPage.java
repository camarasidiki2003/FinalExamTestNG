package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DuplicateCategoryPage extends BasePage{
	WebDriver driver;
	public DuplicateCategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement ADD_FIELD_BUTTON_ELEMENT;
	@FindBy(how = How.NAME, using = "categorydata")
	WebElement ADD_FIELD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/text()[1]")
	WebElement ALREADY_EXIST_FIELD_ELEMENT;
	
	public void userToAddDuplicate(String newCategory) {
		
		ADD_FIELD_ELEMENT.sendKeys("DupCategory");
				
	}
	public void clickOnNewCategoryeButton() {
		ADD_FIELD_BUTTON_ELEMENT.click();
	}
	public void CategoryAlreadyExistValidation(String AlreadyExistDash) {
		Assert.assertEquals(ALREADY_EXIST_FIELD_ELEMENT.getText(), AlreadyExistDash, "Wrong Page!!!");
		
	}
	
	

}
