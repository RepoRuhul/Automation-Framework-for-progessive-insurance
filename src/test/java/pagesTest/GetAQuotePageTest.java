package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class GetAQuotePageTest extends BaseClass{

	
	@Test(enabled = true)
	public void inputTextInUserIdAndPasswordFieldThenClickLoginButtonTest() {
		getAQuotePage.directingToGetAQuotePage();
	}
}
