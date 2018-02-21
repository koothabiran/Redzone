package mapFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configuration.DeviceCapabilities;
import io.appium.java_client.TouchAction;
import loginModule.LoginPage;

public class SimpleSearch 
{
	
	DeviceCapabilities drive = new DeviceCapabilities();
	LoginPage singleUserLogin = new LoginPage();
	
	@BeforeTest
	public void setUp() throws Exception
	{
		drive.setUp();
		drive.driver.resetApp();
	}
	
  @Test
  public void Search() throws Exception 
  {
		Thread.sleep(10000);
		drive.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.hmny.redzone:id/button_login']")).click();
		Thread.sleep(2000);
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/email']")).sendKeys("sugunass");
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/loginPassword']")).sendKeys("redzonee");
		drive.driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Sign in']")).click();
		Thread.sleep(10000);
		
		// Select search button
		drive.driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.hmny.redzone:id/tab_search' and @index='2']")).click();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/autoCompleteTextView']")).sendKeys("gunidy");
		
		//Code for autocomplete
		WebElement autocompleteText = drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/autoCompleteTextView']"));
		int x = autocompleteText.getLocation().getX();
		int y = autocompleteText.getLocation().getY();
		Thread.sleep(2000);
		
		TouchAction action = new TouchAction(drive.driver).tap(x+60, y+150).release();
		action.perform();
		
		
		
  }
}
