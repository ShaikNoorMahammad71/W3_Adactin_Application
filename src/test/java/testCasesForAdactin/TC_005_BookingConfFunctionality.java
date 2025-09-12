package testCasesForAdactin;

import org.testng.annotations.Test;

import pageObject.BookingConfirmartion;

public class TC_005_BookingConfFunctionality extends TC_004_BookHotelFunctionality {
	
	public BookingConfirmartion bcn;
	@Test
	public void bookingctest() {
		bcn = new  BookingConfirmartion(driver);
	
		bcn.itinerarybutton();
		log.info("Click book iteinerary Successfully");
		
		
	}

}

