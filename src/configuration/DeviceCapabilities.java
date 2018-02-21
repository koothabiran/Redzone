package configuration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class DeviceCapabilities 
{
	@SuppressWarnings("rawtypes")
	
	public AndroidDriver driver;
	
	@BeforeTest
	
	public void setUp() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "ZY223K962H");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		capabilities.setCapability(CapabilityType.VERSION, "7.1.1");
		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("app", "C:\\Users\\Varun\\Workspace\\Redzone\\RedZone.apk");
		capabilities.setCapability("appPackage", "com.hmny.redzone");
		capabilities.setCapability("appActivity", "com.hmny.redzone.activities.SplashActivity");
		
		
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
}
