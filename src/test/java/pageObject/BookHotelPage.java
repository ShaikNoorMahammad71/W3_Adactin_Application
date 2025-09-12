package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookHotelPage {
	public WebDriver driver;
	
	Select sc;
	public BookHotelPage(WebDriver dr) {
		this.driver = dr;
		PageFactory.initElements(dr, this);
		
	}
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement fname;
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lname;
	@FindBy(xpath = "//textarea[@id='address']")
	WebElement addr;
	@FindBy(xpath = "//input[@id='cc_num']")
	WebElement ccnum;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	WebElement cctype;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	WebElement expirmonth;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	WebElement expiryear;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	WebElement cvvnum;
	
	@FindBy(xpath = "//input[@id='book_now']")
	WebElement bookbtn;
	
	public void Firstname() {
		fname.sendKeys("Noor Mahammad");
	}
	public void Lastname() {
		lname.sendKeys("Shaik");
	}
	public void Address() {
		addr.sendKeys("Kadiri Street");
	}
	public void CreditCardNum() {
		ccnum.sendKeys("4508750015741019");
	}
	public void CredicardType() {
		sc = new Select(cctype);
		sc.selectByValue("VISA");
		
	}
	
	public void Expairymonth() {
		sc = new Select(expirmonth);
		sc.selectByVisibleText("August");
	}
	public void Expairyear() {
		sc = new Select(expiryear);
		sc.selectByVisibleText("2028");
	}
	public void CvvNum() {
		cvvnum.sendKeys("100");
	}
	public void BookNow() throws InterruptedException{
		
		bookbtn.click();
		Thread.sleep(5000);
	}
	

	
}
