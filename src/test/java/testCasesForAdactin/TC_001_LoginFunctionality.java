package testCasesForAdactin;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import reusableBase.BaseClass;

public class TC_001_LoginFunctionality extends BaseClass {
	public LoginPage lgp;
	
	@Test
	public void logintest() {
		lgp = new LoginPage(driver);
		lgp.UserName(rb.getString("name"));
		log.info("username entered Successfully");
		
		lgp.Password(rb.getString("pswrd"));
		log.info("Password entered Successfully");
		lgp.loginbtn();
		log.info("Login successfully");
	}

}
