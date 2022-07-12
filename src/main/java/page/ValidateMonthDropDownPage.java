package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ValidateMonthDropDownPage {
	WebDriver driver;

	public void VerifyDropdown(WebDriver driver) {
		this.driver = driver;
	}
		@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]")
		WebElement MONTH_FIELD_ELEMENT;
		

		public void VerifyTest1() {
			    Select select = new Select(MONTH_FIELD_ELEMENT);
				List actualDropdownValues = new ArrayList();
				for (WebElement element: select.getOptions()) {
					actualDropdownValues.add(element.getText());
			}
				List expectedDropdownValues = new ArrayList();
				expectedDropdownValues.add("None");
				expectedDropdownValues.add("Jan");
				expectedDropdownValues.add("Feb");
				expectedDropdownValues.add("Mar");
				expectedDropdownValues.add("Apr");
				expectedDropdownValues.add("May");
				expectedDropdownValues.add("Jun");
				expectedDropdownValues.add("Jul");
				expectedDropdownValues.add("Aug");
				expectedDropdownValues.add("Sep");
				expectedDropdownValues.add("Oct");
				expectedDropdownValues.add("Nov");
				expectedDropdownValues.add("Dec");
				for (int i = 0; i<actualDropdownValues.size(); i++) {
					System.out.println("Actual : "+actualDropdownValues.get(i)+" & Expected : "+expectedDropdownValues.get(i));
					Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues.get(i)));
				}
				System.out.println("Validation completed and it has passed, thank you for your attention");
		}
	
	

}
