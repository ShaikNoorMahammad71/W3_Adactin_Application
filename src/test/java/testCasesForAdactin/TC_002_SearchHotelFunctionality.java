package testCasesForAdactin;

import org.testng.annotations.Test;

import pageObject.SearchHotelPage;

public class TC_002_SearchHotelFunctionality extends TC_001_LoginFunctionality {
	public SearchHotelPage shpage;
	@Test
	public void searcHoteltest() throws InterruptedException  {
		shpage = new SearchHotelPage(driver);
		
		shpage.Locations();
		log.info("Select location Successfully");
		shpage.hotels();
		log.info("Select hotel Successfully");
		shpage.RoomType();
		log.info("Select room Successfully");
		shpage.NumberOfRooms();
		log.info("Select number of rooms Successfully");
		shpage.CheckInDate();
		log.info("Enter check in date  Successfully");
		shpage.CheckOutDate();
		log.info("Enter check out date  Successfully");
		shpage.AdultsPerRoom();
		log.info("Select adults per rooms Successfully");
		shpage.ChildrenPerRoom();
		log.info("Select childerns per rooms Successfully");
		shpage.submitButton();
		log.info("Submit Successfully");
		
	}

}
