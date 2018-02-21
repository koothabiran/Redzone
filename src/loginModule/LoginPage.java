package loginModule;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configuration.DeviceCapabilities;


public class LoginPage {
	
	DeviceCapabilities obj = new DeviceCapabilities();	
	
	@BeforeTest
	
	public void setUp() throws MalformedURLException
	{
		obj.setUp();
		obj.driver.resetApp();
	}
	
	  @Test
	  public void loginSingleUser() throws Exception
	  {
		  // LOGIN PAGE
		  // Location access container
//		  if (obj.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']")).isDisplayed())
//		  {
//			  obj.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button' and @text='Allow']")).click();
//		  }		  
		  // Login button
		  Thread.sleep(10000);
		  obj.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.hmny.redzone:id/button_login']")).click();
		  Thread.sleep(2000);
		  // User name text field
		  obj.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/email']")).sendKeys("sugunass");
//		  obj.driver.hideKeyboard();
		  // Password text field
		  obj.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/loginPassword']")).sendKeys("redzonee");
//		  obj.driver.hideKeyboard();
		  // Signin button click
		  obj.driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Sign in']")).click();
		  Thread.sleep(5000);
		  // Gallary access container
//		  if (obj.driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.android.packageinstaller:id/dialog_container']")).isDisplayed()) 
//		  {
//			  obj.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button' and @text='Allow']")).click();;
//		  }
		  
		  
	  }
//  
//	  @AfterTest
//	  public void End()
//	  {
//		  obj.driver.quit();
//	  }
  
  
}
