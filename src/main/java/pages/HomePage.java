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
	public void clickPropertyType() {
		pause(2);
		clickElement(property);
		elementDisplayed(property);
		currentUrl(driver);
		verifyTitle(driver, "An Insurance Company You Can Rely On | Progressive");
		pause(3);
//		driver.navigate().back();
//		pause(2);
//		clickElement(property);
//		pause(3);

		
	}

}
