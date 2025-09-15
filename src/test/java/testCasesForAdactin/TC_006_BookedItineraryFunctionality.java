package testCasesForAdactin;



import org.testng.annotations.Test;

import pageObject.BookedItinerary;

public class TC_006_BookedItineraryFunctionality extends TC_005_BookingConfFunctionality {
	
	public BookedItinerary bip;
	@Test
	public void cancelItinerarytest() throws InterruptedException  {
		bip = new BookedItinerary(driver);
		
		bip.selectcheckbox();
		log.info("Select checkbox Successfully");
		
		bip.CancelSlected();
		log.info("Cancel selected Successfully");
		bip.LogOutApp();
		log.info("logout Successfully");
		bip.Loginagain();
		log.info("Login again Successfully");
		
		bip.forget();
		log.info("Forge Password click Successfully");
		
	}

}
