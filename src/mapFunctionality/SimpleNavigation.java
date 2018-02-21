package mapFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configuration.DeviceCapabilities;
import io.appium.java_client.TouchAction;
import loginModule.LoginPage;

public class SimpleNavigation {
	
	DeviceCapabilities drive = new DeviceCapabilities();
	LoginPage singleUserLogin = new LoginPage();
	
	@BeforeTest
	public void setUp() throws Exception
	{
		drive.setUp();
		drive.driver.resetApp();
	}
	@Test
	public void Navigation() throws Exception
	{
		// User login
		Thread.sleep(10000);
		drive.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.hmny.redzone:id/button_login']")).click();
		Thread.sleep(2000);
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/email']")).sendKeys("sugunass");
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/loginPassword']")).sendKeys("redzonee");
		drive.driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Sign in']")).click();
		Thread.sleep(10000);
			
		// select navigation
		drive.driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.hmny.redzone:id/tab_navigate' and @index='1']")).click();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/destinationText']")).click();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/autoCompleteTextView']")).sendKeys("guindy");
		
		//Code for autocomplete
		WebElement autocompleteText = drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/autoCompleteTextView']"));
		int x = autocompleteText.getLocation().getX();
		int y = autocompleteText.getLocation().getY();
		Thread.sleep(2000);
		
		TouchAction action = new TouchAction(drive.driver).tap(x+60, y+250).release();
		action.perform();
		
		drive.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/navigateButton']")).click();
	  }
}
