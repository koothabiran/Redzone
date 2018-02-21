package loginModule;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configuration.DeviceCapabilities;

public class SignUpUser {
	
	DeviceCapabilities obj = new DeviceCapabilities();
	
	@BeforeTest
	
	public void setUp() throws MalformedURLException
	{
		obj.setUp();
		obj.driver.resetApp();
	}
	
	@Test
	
	public void userSignUp() throws Exception 
	{
		

		// SIGN UP PAGE
		  // Location access container
//		  if (obj.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']")).isDisplayed())
//		  {
//			  obj.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button' and @text='Allow']")).click();
//		  }	
		  
		  // Signup button 
		  obj.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.hmny.redzone:id/button_sign_up']")).click();
		  
		  //User input
		  
		  obj.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/username']")).sendKeys("micromaxxxx");
		  obj.driver.hideKeyboard();
		  obj.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/email']")).sendKeys("surya@gmail.com");
		  obj.driver.hideKeyboard();
		  obj.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/firstName']")).sendKeys("surya");
		  obj.driver.hideKeyboard();
		  obj.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/lastName']")).sendKeys("ss");
		  obj.driver.hideKeyboard();
		  obj.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/password']")).sendKeys("redzone");
		  obj.driver.hideKeyboard();
		  obj.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/cPassword']")).sendKeys("redzone");
		  obj.driver.hideKeyboard();
		  
		  // sign up button
		  obj.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.hmny.redzone:id/signUp']")).click();
		  
		  // Gallary access container
//		  if (obj.driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.android.packageinstaller:id/dialog_container']")).isDisplayed()) 
//		  {
//			  obj.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button' and @text='Allow']")).click();;
//		  }
		 
	}
	
//	  @AfterTest
//	  public void End()
//	  {
//		  obj.driver.quit();
//	  }

}
