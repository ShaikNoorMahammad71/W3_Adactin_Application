package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPassword_page {
	public WebDriver driver;
	public ForgetPassword_page(WebDriver dr) {
		this.driver = dr;
		PageFactory.initElements(dr, this);

	}

	@FindBy(xpath = "//a[text()='Go back to Login page']")
	WebElement gbkh;

	public void forbutton() {
		gbkh.click();
	}

}
