package pages;

import static common.CommonActions.clickElement;
import static common.CommonActions.currentUrl;
import static common.CommonActions.elementDisplayed;
import static common.CommonActions.inputText;
import static common.CommonActions.pause;
import static common.CommonActions.verifyTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPropertyTypePage {
	
	WebDriver driver;

	public  SelectPropertyTypePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
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

	public void clickPropertyType() {
		driver.navigate().to("https://www.progressive.com/#s");
//		clickElement(condo);
//		pause(2);
//		//clickElement(condo);
//		//elementDisplayed(condo);
//		currentUrl(driver);
//		verifyTitle(driver, "An Insurance Company You Can Rely On | Progressive");
//		pause(3);
//		clickElement(renters);
//		pause(2);
//
//		clickElement(mobileHome);
//		pause(2);
//
//		clickElement(Homeowners);
//		pause(2);

//		clickElement(auto);
//		pause(1);
		clickElement(EnterZipcode);
		pause(2);

		inputText(EnterZipcode, "14215");
		pause(2);

		clickElement(get_a_quote);
		pause(5);

	}

	

}
