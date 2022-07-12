package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class AddCategoryPage extends BasePage{

	WebDriver driver;

	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement ADD_FIELD_BUTTON_ELEMENT;
	@FindBy(how = How.NAME, using = "categorydata")
	WebElement ADD_FIELD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"label-first\"]/b")
	WebElement DASHBOARD_PAGE_ELEMENT;

	public void validateDashboardPage(String dashboard) {
		Assert.assertEquals(DASHBOARD_PAGE_ELEMENT.getText(), dashboard, "Wrong Page!!");
	}

	public void clickOnNewCategoryeButton() {
		ADD_FIELD_BUTTON_ELEMENT.click();
		
	}

	public void insertNewCategory(String newCategory) {
		ADD_FIELD_ELEMENT.sendKeys(newCategory + generateRandomNo(999));
	}

	
}
