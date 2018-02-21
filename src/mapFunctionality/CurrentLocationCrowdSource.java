package mapFunctionality;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configuration.DeviceCapabilities;
import loginModule.LoginPage;

public class CurrentLocationCrowdSource {
	
	DeviceCapabilities device = new DeviceCapabilities();
	LoginPage singleUserLogin = new LoginPage();
	
	@BeforeTest
	public void setUp() throws Exception
	{
		device.setUp();
		device.driver.resetApp();
	}
	
  @Test
  public void reportIncident() throws Exception
  {
	  
	  //singleUserLogin.loginSingleUser();
	  
	  // User login
	  Thread.sleep(10000);
	  device.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.hmny.redzone:id/button_login']")).click();
	  Thread.sleep(2000);
	  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/email']")).sendKeys("sugunass");
	  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/loginPassword']")).sendKeys("redzonee");
	  device.driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Sign in']")).click();
	  
	  Thread.sleep(10000);
	  device.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.hmny.redzone:id/fab_announce']")).click();
	  
	  // Get random number between 1 to 12 
	  Random randomValue = new Random();
	  Integer crimeType = randomValue.nextInt(12) + 1;
	  System.out.println("Selected number : " + crimeType);
	  
	  // Get the input from user
//	  BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
//	  System.out.print("Enter value between 1 to 12 : ");
//	  crimeType = Integer.parseInt(br.readLine());
	  
	  
	  // crime types
	  switch(crimeType)
	  {
	  case 1:
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/sampleOne']")).click();
		  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_report_details']")).sendKeys("Shooting Test Report");
		  break;
	  case 2:
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/sampleTwo']")).click();
		  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_report_details']")).sendKeys("Assault Test Report");
		  break;
	  case 3:
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/sampleThree']")).click();
		  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_report_details']")).sendKeys("Vandalism Test Report");
		  break;
	  case 4:
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/sampleFour']")).click();
		  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_report_details']")).sendKeys("Arson Test Report");
		  break;
	  case 5:
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/sampleFive']")).click();
		  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_report_details']")).sendKeys("Public distrubance Test Report");
		  break;
	  case 6:
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/sampleSix']")).click();
		  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_report_details']")).sendKeys("Theft Test Report");
		  break;
	  case 7:
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/sampleSeven']")).click();
		  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_report_details']")).sendKeys("SexualAssault Test Report");
		  break;
	  case 8:
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/sampleEight']")).click();
		  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_report_details']")).sendKeys("Suspicious Test Report");
		  break;
	  case 9:
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/sampleNine']")).click();
		  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_report_details']")).sendKeys("Hazard Test Report");
		  break;
	  case 10:
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/sampleTen']")).click();
		  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_report_details']")).sendKeys("MapIssue Test Report");
		  break;
	  case 11:
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/sampleEleven']")).click();
		  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_report_details']")).sendKeys("Police Test Report");
		  break;
	  case 12:
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.hmny.redzone:id/sampleTwelve']")).click();
		  device.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.hmny.redzone:id/edt_report_details']")).sendKeys("Traffic Test Report");
		  break;
	  default:
		  System.out.println("Please enter between 1 to 12");
		  break;
	  }
	  
	  
	  // Capture image
	  String picFrom = "fromCamera";
	  device.driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.hmny.redzone:id/imgbtn_camera']")).click();
	  switch (picFrom)
	  {
	  case "fromCamera":
		  device.driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Take Photo']")).click();
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.android.gallery3d:id/shutter_button_photo']")).click();
		  device.driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.android.gallery3d:id/btn_done']")).click();
		  break;
	  case "fromGalary":
		  device.driver.findElement(By.xpath("//android.widget.TextView[@index='1' and @text='Choose from Library']")).click();
		  break;
	  }
	  
	  //Post the crime
	  device.driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.hmny.redzone:id/imgbtn_send']")).click();
  }
}
