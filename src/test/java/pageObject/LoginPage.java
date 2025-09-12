package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver dr) {
		this.driver = dr;
		PageFactory.initElements(dr, this);
				
				
		
	}
	@FindBy(xpath="//input[@id='username']")
	WebElement username;  

	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//input[@id='login']")
	WebElement loginBtn;
	
	public void UserName(String name) {
		username.sendKeys(name);
		}
	public void Password(String pswrd) {
		password.sendKeys(pswrd);
	}
	public void loginbtn() {
		loginBtn.click();
	}
 	
// 	By username = By.xpath("//input[@id='username']");
// 	By password = By.xpath("//input[@id='password']");
// 	By login = By.xpath("//input[@id='login']");
// 	
// 	public void username() {
// 		driver.findElement(username).sendKeys("ShaikMahammad");
// 	}
// 
//	public void password() {
//		driver.findElement(password).sendKeys("NooR1234@");
//	}
//	
//	public void login() {
//		driver.findElement(login).click();
//	}
}
