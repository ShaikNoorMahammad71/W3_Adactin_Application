package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary {
public WebDriver driver;
public BookedItinerary(WebDriver dr) {
	this.driver = dr;
	PageFactory.initElements(dr, this);
	
	}

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    WebElement checkb;
    
    @FindBy(xpath = "(//input[@class='reg_button'])[1]")
    WebElement cancElement;
    
    @FindBy(xpath = "//input[@id='logout']")
    WebElement logoutElement;
    @FindBy(xpath = "//a[@href='index.php']")
    WebElement logina;
    
    
    public void selectcheckbox() {
    	checkb.click();
    }
    public void CancelSlected() throws InterruptedException {
    	cancElement.click();
    	driver.switchTo().alert().accept();
    	Thread.sleep(8000);
    }
    public void LogOutApp() {
    	logoutElement.click();
    }
    public void Loginagain() {
    	logina.click();
    }







}
