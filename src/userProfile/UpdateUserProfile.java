package userProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configuration.DeviceCapabilities;
import loginModule.LoginPage;

public class UpdateUserProfile {
	
	DeviceCapabilities drive = new DeviceCapabilities();
	LoginPage singleUserLogin = new LoginPage();
	
	@BeforeTest
	public void setUp() throws Exception
	{
		drive.setUp();
		drive.driver.resetApp();
	}
	
	@Test
	public void UpdateAll() throws Exception
	{
		//singleUserLogin.loginSingleUser();
		  Thread.sleep(10000);
		  drive.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.hmny.redzone:id/button_login']")).click();
		  Thread.sleep(2000);
		  drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/email']")).sendKeys("sugunass");
		  drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/loginPassword']")).sendKeys("redzonee");
		  drive.driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Sign in']")).click();
		  Thread.sleep(10000);
		drive.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/img_profile']")).click();
		Thread.sleep(20000);
		drive.driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.hmny.redzone:id/btn_account_settings']")).click();
		
		// UserProfile
		String picFrom = "fromCamera";
		drive.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/img_profile']")).click();
		switch (picFrom)
		{
		case "fromCamera":
			drive.driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Take Photo']")).click();
			drive.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.android.gallery3d:id/shutter_button_photo']")).click();
			drive.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.android.gallery3d:id/btn_done']")).click();
			break;
		case "fromGalary":
			drive.driver.findElement(By.xpath("//android.widget.TextView[@index='1' and @text='Choose from Library']")).click();
			break;
		}

		// User Details
		WebElement firstName = drive.driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.hmny.redzone:id/tv_firstname']"));
		firstName.click();
		drive.driver.hideKeyboard();
		WebElement lastName = drive.driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.hmny.redzone:id/tv_lastname']"));
		lastName.click();
		drive.driver.hideKeyboard();
		WebElement userName = drive.driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.hmny.redzone:id/tv_username']"));
		userName.click();
		drive.driver.hideKeyboard();
		WebElement eMail = drive.driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.hmny.redzone:id/tv_email']"));
		eMail.click();
		drive.driver.hideKeyboard();
		WebElement password = drive.driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.hmny.redzone:id/tv_password']"));
		password.click();
		drive.driver.hideKeyboard();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_firstname']")).clear();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_firstname']")).sendKeys("sugunass");
		drive.driver.hideKeyboard();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_lastname']")).clear();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_lastname']")).sendKeys("asaithambiss");
		drive.driver.hideKeyboard();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_username']")).clear();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_username']")).sendKeys("sugunass");
		drive.driver.hideKeyboard();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_email']")).clear();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_email']")).sendKeys("suguna@sybrant.com");
		drive.driver.hideKeyboard();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_password']")).clear();
		drive.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_password']")).sendKeys("redzonee");
		drive.driver.hideKeyboard();
		drive.driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.hmny.redzone:id/tv_dob']")).click();
		drive.driver.findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys("May");
		drive.driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys("01");
		drive.driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys("1990");
		drive.driver.hideKeyboard();
		drive.driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']")).click();
		drive.driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.hmny.redzone:id/female']")).click();
		drive.driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.hmny.redzone:id/action_submit']")).click();
		
	}
}
