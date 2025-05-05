package listenerutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import learning_group_execution.BaseConfig1;

public class ListenerImpl implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		String testname=result.getName();
		
		//1. perform typecasting from WebDriver to TakesSceenshot.
		TakesScreenshot ts=(TakesScreenshot) BaseConfig1.static_driver;
		
		//2.call the screenshot in temp path
		//3. store Screenshot in temp path
		 File temp_path=ts.getScreenshotAs(OutputType.FILE);
		 
		 //4.create a New Permanent Path for Screenshot
		 File Permanent_path =new File("./Screenshot/"+testname+".png");
		 
		 try {
			FileHandler.copy(temp_path, Permanent_path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
	

}
