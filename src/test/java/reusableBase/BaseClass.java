package reusableBase;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;



public class BaseClass {
	public static WebDriver driver;
	public ResourceBundle rb;
	public Logger log;
	
	
	@BeforeSuite
	@Parameters({"Browser", "URL"})
	public void OpenAppliction(String Browser, String URL) {
		
		if (Browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}else if (Browser.equals("Edge")) {driver= new EdgeDriver();}
		else if (Browser.equals("Firfox")) {driver=new FirefoxDriver();}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		rb = ResourceBundle.getBundle("LData");
		log = Logger.getLogger("AdactinProject");		
		PropertyConfigurator.configure("Lod4jAD.properties");
		
		
	}
	public void CaptureScreenshot(String status) throws IOException {
		
		TakesScreenshot takesc = (TakesScreenshot) driver;
		File src = takesc.getScreenshotAs(OutputType.FILE);
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		    String timestamp = dateFormat.format(new Date());
		    String path = "C:\\new eclipse\\eclipse-workspace\\AdactinProject\\screenshot\\"+ status + "_" + timestamp + ".png";
		    File tar = new File(path);
		    FileHandler.copy(src, tar);
		}
		
	
	
	
	@AfterSuite
	public void CloseApplication() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
