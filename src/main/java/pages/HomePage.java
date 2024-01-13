package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(), 'Property')]")
	WebElement property;

	@FindBy(xpath = "//label[contains(text(), 'Condo')]")
	WebElement condo;

	@FindBy(xpath = "//label[contains(text(), 'Renters')]")
	WebElement renters;

	@FindBy(xpath = "//label[contains(text(), 'Mobile Home')]")
	WebElement mobileHome; //

	@FindBy(xpath = "//label[contains(text(), 'Homeowners')]")
	WebElement Homeowners; //

//	@FindBy(xpath = "//*[@id=\'QuoteStartForm_overlay_subproducts\']/div[1]/div[2]/div[2]/button")
//	WebElement auto; //

	@FindBy(xpath = "//input[@id='zipCode_overlay_subproducts']")
	WebElement EnterZipcode; //

	@FindBy(id = "qsButton_overlay_subproducts")
	WebElement get_a_quote; //
	
	

	public void clickPropertyButton() {
		pause(2);
		clickElement(property);
		elementDisplayed(property);
		currentUrl(driver);
		verifyTitle(driver, "An Insurance Company You Can Rely On | Progressive");
		pause(3);
		driver.navigate().back();
		pause(2);
		clickElement(property);
		pause(3);
		
		clickElement(condo);
		pause(2);
		clickElement(condo);
		elementDisplayed(condo);
		currentUrl(driver);
		verifyTitle(driver, "An Insurance Company You Can Rely On | Progressive");
		pause(3);

		clickElement(renters);
		pause(2);

		clickElement(mobileHome);
		pause(2);

		clickElement(Homeowners);
		pause(2);

//		clickElement(auto);
//		pause(1);

		inputText(EnterZipcode, "14215");
		pause(2);

		clickElement(get_a_quote);
		pause(5);

	
	}

}
