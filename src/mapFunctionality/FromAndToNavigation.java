package mapFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configuration.AutoComplete;
import configuration.DeviceCapabilities;
import loginModule.LoginPage;

public class FromAndToNavigation 
{
	DeviceCapabilities drive = new DeviceCapabilities();
	LoginPage singleUserLogin = new LoginPage();
	AutoComplete autoCompleteForText = new AutoComplete();
	
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
		
		// source and destination text field
		WebElement autocompleteText;
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/sourceText']")).click();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/autoCompleteTextView']")).sendKeys("t nager");
		autocompleteText = drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/autoCompleteTextView']"));
		autoCompleteForText.autoComplete(autocompleteText, drive.driver);
		Thread.sleep(10000);
		
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/destinationText']")).click();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/autoCompleteTextView']")).sendKeys("guindy");
		autocompleteText = drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/autoCompleteTextView']"));
		autoCompleteForText.autoComplete(autocompleteText, drive.driver);
		Thread.sleep(10000);
		
		drive.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/navigateButton']")).click();
	}
	
	//Code for autocomplete
//	private void autoComplete(WebElement autocomplateValue) throws Exception
//	{
//		int x = autocomplateValue.getLocation().getX();
//		int y = autocomplateValue.getLocation().getY();
//		Thread.sleep(2000);
//		
//		TouchAction action = new TouchAction(drive.driver).tap(x+60, y+250).release();
//		action.perform();
//	}
}
