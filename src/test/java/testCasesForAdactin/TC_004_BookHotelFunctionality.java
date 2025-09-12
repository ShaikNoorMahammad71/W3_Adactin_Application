package testCasesForAdactin;

import org.testng.annotations.Test;

import pageObject.BookHotelPage;



public class TC_004_BookHotelFunctionality extends TC_003_SelectHotelFunctionality {

	public BookHotelPage bhp;
	@Test
	public void bookhotel() throws InterruptedException  {
		bhp = new BookHotelPage(driver);
		bhp.Firstname();
		log.info("Enter first name Successfully");
		bhp.Lastname();
		log.info("Enter last name Successfully");
		bhp.Address();
		log.info("Enter Adress Successfully");
		bhp.CreditCardNum();
		log.info("Enter Creadit card number Successfully");
		bhp.CredicardType();
		log.info("Enter Creadit card type Successfully");
		bhp.Expairymonth();
		log.info("Enter expairy month Successfully");
		bhp.Expairyear();
		log.info("Enter expairy year Successfully");
		bhp.CvvNum();
		log.info("Enter CVV number Successfully");
		bhp.BookNow();
		log.info("Click booknow Successfully");
		
	}


}
