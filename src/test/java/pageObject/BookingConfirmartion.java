package pageObject;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BookingConfirmartion {
	public WebDriver driver;
	public BookingConfirmartion(WebDriver dr) {
		this.driver = dr;
		PageFactory.initElements(dr, this);

	}

	@FindBy(xpath = "//input[@id='my_itinerary']")
	WebElement itbtn;

	public void itinerarybutton() {
		 itbtn.click();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
	}

}
