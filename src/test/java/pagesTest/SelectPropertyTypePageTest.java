package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class SelectPropertyTypePageTest extends BaseClass {

	@Test(enabled = true)
	public void homePageTest() {

		selectPropertyTypePage.clickPropertyType();
	}

}
