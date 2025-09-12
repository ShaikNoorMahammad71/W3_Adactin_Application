package testCasesForAdactin;

import org.testng.annotations.Test;

import pageObject.SelectHotelPage;

public class TC_003_SelectHotelFunctionality extends TC_002_SearchHotelFunctionality {
	
	public SelectHotelPage shp;
	@Test
	public void hotelselction() throws InterruptedException  {
		shp = new SelectHotelPage(driver);
		shp.selectRadiobutton();
		log.info("Select Radio button Successfully");
		shp.ContinueButton();
		log.info("Click Continue button Successfully");
		
		
	}

}
