package testCasesForAdactin;

import org.testng.annotations.Test;


import pageObject.ForgetPassword_page;

public class TC_007_ForgetPasswordFunctionality extends TC_006_BookedItineraryFunctionality {

	public ForgetPassword_page bip;
	@Test
	public void Forgetpassword(){
		bip = new ForgetPassword_page(driver);
		
		bip.forbutton();
		log.info("forget click Successfully");
	}
}
