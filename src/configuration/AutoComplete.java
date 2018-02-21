package configuration;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class AutoComplete
{	
	@SuppressWarnings("rawtypes")
	
	@Test
	public void autoComplete(WebElement autocomplateValue, AndroidDriver drive) throws Exception
	{
		int x = autocomplateValue.getLocation().getX();
		int y = autocomplateValue.getLocation().getY();
		Thread.sleep(2000);
		
		TouchAction action = new TouchAction(drive).tap(x+60, y+250).release();
		action.perform();
	}
}
