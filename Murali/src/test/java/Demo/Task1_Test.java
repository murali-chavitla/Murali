package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Task1_Test {
	
	@Test
	public void demoTask1() throws InterruptedException {
		
		//Step1: Launch Browser
		WebDriver driver= new ChromeDriver();
		
		
		//Step2: Navigate to applicaion
		driver.get("https://www.saucedemo.com/");
		
		
		//Verfy the PAge
		
		String title=driver.getTitle();
		Reporter.log(title, true);
		
		Thread.sleep(5000);
		//Step3: Close the Browser
		driver.quit();
		Reporter.log("Demo Task 1 Executed",true);
		
	}

}
