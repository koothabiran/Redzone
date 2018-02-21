package userProfile;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configuration.DeviceCapabilities;
import io.appium.java_client.MobileElement;
import loginModule.LoginPage;

public class MapFilter {
	DeviceCapabilities device = new DeviceCapabilities();
	LoginPage userLogin = new LoginPage();
	
	@BeforeTest
	public void setUp() throws Exception
	{
		device.setUp();
		device.driver.resetApp();
		//userLogin.loginSingleUser();
	}
	
  @Test
  public void mapFilterOnOff() throws Exception
  {
	  MobileElement mapFilterName; 
	  String mapFilterValue;
	  
	  Thread.sleep(10000);
	  device.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.hmny.redzone:id/button_login']")).click();
	  Thread.sleep(2000);
	  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/email']")).sendKeys("sugunass");
	  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/loginPassword']")).sendKeys("redzonee");
	  device.driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Sign in']")).click();
	  Thread.sleep(10000);
	  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/img_profile']")).click();
	  Thread.sleep(20000);  
	  
	  // Critical Offense 
	  mapFilterName = (MobileElement) device.driver.findElement(By.xpath("//android.widget.Switch[@resource-id='com.hmny.redzone:id/one']"));
	  mapFilterValue = mapFilterName.getText();
	  if (mapFilterValue.equals("Critical Offense OFF"))
		  mapFilterName.tap(1, 1);
	  
	  // Shooting 
	  mapFilterName = (MobileElement) device.driver.findElement(By.xpath("//android.widget.Switch[@resource-id='com.hmny.redzone:id/two']"));
	  mapFilterValue = mapFilterName.getText();
	  if (mapFilterValue.equals("Shooting OFF"))
		  mapFilterName.tap(1, 1);
	  
	  // Assault 
	  mapFilterName = (MobileElement) device.driver.findElement(By.xpath("//android.widget.Switch[@resource-id='com.hmny.redzone:id/three']"));
	  mapFilterValue = mapFilterName.getText();
	  if (mapFilterValue.equals("Assault OFF"))
		  mapFilterName.tap(1, 1);
	  
	  // Theft 
	  mapFilterName = (MobileElement) device.driver.findElement(By.xpath("//android.widget.Switch[@resource-id='com.hmny.redzone:id/four']"));
	  mapFilterValue = mapFilterName.getText();
	  if (mapFilterValue.equals("Theft OFF"))
		  mapFilterName.tap(1, 1);
	  
	  // Arson 
	  mapFilterName = (MobileElement) device.driver.findElement(By.xpath("//android.widget.Switch[@resource-id='com.hmny.redzone:id/five']"));
	  mapFilterValue = mapFilterName.getText();
	  if (mapFilterValue.equals("Arson OFF"))
		  mapFilterName.tap(1, 1);
	  
	  //Sexual Assault
	  mapFilterName = (MobileElement) device.driver.findElement(By.xpath("//android.widget.Switch[@resource-id='com.hmny.redzone:id/six']"));
	  mapFilterValue = mapFilterName.getText();
	  if (mapFilterValue.equals("Sexual Assault OFF"))
	  	mapFilterName.tap(1, 1);
	  
	  //Statutory Crime 
	  mapFilterName = (MobileElement) device.driver.findElement(By.xpath("//android.widget.Switch[@resource-id='com.hmny.redzone:id/seven']"));
	  mapFilterValue = mapFilterName.getText();
	  if (mapFilterValue.equals("Statutory Crime OFF"))
		  mapFilterName.tap(1, 1);
  }
}
