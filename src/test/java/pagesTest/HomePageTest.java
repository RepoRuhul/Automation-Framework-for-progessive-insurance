package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = true)
	public void homePageTest() {

		homePage.clickPropertyType();
	}

}
