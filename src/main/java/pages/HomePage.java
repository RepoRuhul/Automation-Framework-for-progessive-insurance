package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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
	
	@FindBy(xpath = "//input[@id='AddressEntryPrefillEdit_embedded_questions_list_PropertyAddressSearch']")
	WebElement propertyAddressField; //

	@FindBy(xpath = "//input[@id='AddressEntryPrefillEdit_embedded_questions_list_HasApartmentNumber']")
	WebElement apartment;
	@FindBy(xpath = "//input[@name='AddressEntryPrefillEdit_embedded_questions_list_ApartmentUnit']")
	WebElement apartmentNumber; //
	
	

	
	
	
	
	
	@FindBy(id = "AddressEntryPrefillEdit_embedded_questions_list_FirstName")
	WebElement firstName; //
	@FindBy(id = "AddressEntryPrefillEdit_embedded_questions_list_MiddleInitial")
	WebElement middleName; //
	@FindBy(id = "AddressEntryPrefillEdit_embedded_questions_list_LastName")
	WebElement lastName; //

	@FindBy(xpath = "//input[@id='AddressEntryPrefillEdit_embedded_questions_list_DateOfBirth']")
	WebElement dateOfBirth; //

	public void inputTextInUserIdAndPasswordFieldThenClickLoginButton() {
		pause(1);
		clickElement(property);
		pause(3);

		clickElement(condo);
		pause(1);

		clickElement(renters);
		pause(1);

		clickElement(mobileHome);
		pause(1);

		clickElement(Homeowners);
		pause(1);

//		clickElement(auto);
//		pause(1);

		inputText(EnterZipcode, "14215");
		pause(1);

		clickElement(get_a_quote);
		pause(5);

		inputText(propertyAddressField, "3343 Bailey Ave");
		pause(1);

		clickElement(apartment);
		pause(5);
		inputText(apartmentNumber, "2A");
		pause(5);
		
		inputText(firstName, "Abdullah");
		pause(1);

		inputText(middleName, "Al");
		pause(1);

		inputText(lastName, "Mamun");
		pause(1);

		inputText(dateOfBirth, "10102009");
		pause(1);

	}

}
