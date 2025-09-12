package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage  {
	public WebDriver driver;
	public SelectHotelPage(WebDriver dr) {
		this.driver =dr;
		PageFactory.initElements(dr, this);
		
	}
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	WebElement rdiobtn;
	@FindBy(xpath = "//input[@id='continue']")
	WebElement continuebtn;
	
	public void selectRadiobutton() {
		rdiobtn.click();
	}
	public void ContinueButton() throws InterruptedException{
		
		continuebtn.click();
		Thread.sleep(3000);
	}

}
