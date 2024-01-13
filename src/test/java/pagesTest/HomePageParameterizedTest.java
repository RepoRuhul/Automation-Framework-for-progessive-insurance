package pagesTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseUtil.BaseClass;
import static constants.IParams.*;

public class HomePageParameterizedTest extends BaseClass {

	@Test
	@Parameters({USERIDFIELDTEXT, PASSWORDFIELDTEXT, ERRORMSG})
	public void loginValidation(String userIdFieldText, String passwordFieldText, String errorMsg) {
	
	}

}
