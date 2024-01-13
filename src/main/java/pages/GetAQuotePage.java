package pages;

import static common.CommonActions.clickElement;
import static common.CommonActions.inputText;
import static common.CommonActions.pause;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetAQuotePage {
	
	WebDriver driver;

	public GetAQuotePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
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
	
	
	
	

	public void directingToGetAQuotePage() {
		
		
		
		
		inputText(propertyAddressField, "3343 Bailey Ave");
		pause(2);

		clickElement(apartment);
		pause(5);
		inputText(apartmentNumber, "2A");
		pause(5);
		
		inputText(firstName, "Abdullah");
		pause(2);

		inputText(middleName, "Al");
		pause(2);

		inputText(lastName, "Mamun");
		pause(2);

		inputText(dateOfBirth, "10102009");
		pause(2);

	}
	
	
	
}
