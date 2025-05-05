package GenaricUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasicConfigAnnoPom extends BasicConfigPOM {


	

	public BasicConfigAnnoPom(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public  WebDriver driver;
	
	BasicConfigPOM logConfig=new BasicConfigPOM(driver);
	@BeforeClass
	public void browserSetup() {
		driver=new ChromeDriver();
		Reporter.log("step1 : Browser launched sucessfully...", true);
		driver.get("https://www.automationexercise.com/");
		Reporter.log("step2 : Navigated to application  sucessfully...", true);
		
		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		//BasicConfigPOM logConfig=new BasicConfigPOM(driver);
		logConfig.getSignup().click();
		logConfig.getLogInEmail().sendKeys("dinga1@gmail.com");
		Thread.sleep(2000);
		logConfig.getPassword().sendKeys("dinga1234");
		Thread.sleep(2000);
		logConfig.getLogin().click();
		
		Reporter.log("step 5: login sucessfully...", true);
		
		
	}
	
	@AfterMethod()
	public void logout() throws InterruptedException {
		//BasicConfigPOM logConfig=new BasicConfigPOM(driver);
		logConfig.getLogout().click();
		Thread.sleep(2000);
		Reporter.log("logout sucessfully...", true);
	}	
	
	@AfterClass()
	public void close() {
		driver.close();
	}

}
