package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage {
	public WebDriver driver;
	public Select sc;
	public SearchHotelPage(WebDriver dr) {
		this.driver = dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath = "//select[@id='location']")
	WebElement dropdnloc;
	
	@FindBy(xpath = "//select[@id='hotels']")
	WebElement selchotel;
	
	@FindBy(xpath = "//select[@id='room_type']")
	WebElement roomty;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	WebElement nomroom;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	WebElement indate;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	WebElement outdate;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	WebElement adulsroom;
	
	@FindBy(xpath = "//select[@id='child_room']")
	WebElement childroom;
	
	@FindBy(xpath = "//input[@id='Submit']")
	WebElement subbtn;
		
	public void Locations() {
		sc = new Select(dropdnloc);
		sc.selectByIndex(2);
	}
	public void hotels() {
		sc = new Select(selchotel);
		sc.selectByIndex(1);
	}
	public void RoomType() {
		sc = new Select(roomty);
		sc.selectByIndex(3);
	}
	public void NumberOfRooms() {
		sc = new Select(nomroom);
		sc.selectByIndex(2);
	}
	public void CheckInDate() {
		indate.sendKeys("22/08/2025");
	}
	public void CheckOutDate() {
		outdate.sendKeys("29/08/2025");
	}
	public void AdultsPerRoom() {
		sc = new Select(adulsroom);
		sc.selectByValue("2");
	}
	public void ChildrenPerRoom() {
		sc = new Select(childroom);
		sc.selectByIndex(2);		
	}
	public void submitButton() throws InterruptedException {
		subbtn.click();
		Thread.sleep(3000);
	}

}
