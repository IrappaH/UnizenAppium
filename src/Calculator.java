import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {

		public static void main(String[] args) throws MalformedURLException {
			System.out.println("Start...");
			DesiredCapabilities caps = new DesiredCapabilities();
			/*caps.setCapability("deviceName", "Irappa");
			caps.setCapability("udid", "RZ8M519H1SH"); // Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "9.0");
			caps.setCapability("autoGrantPermissions", "true");
			caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			caps.setCapability("appActivity", "com.sec.android.app.popupcalculator");		
			caps.setCapability("noReset", "true");		*/
			caps.setCapability("deviceName", "Irappa");
			caps.setCapability("udid", "92010cc4e4cfb31f"); // Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "5.1.1");
			caps.setCapability("autoGrantPermissions", "true");
			caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");		
			caps.setCapability("noReset", "true");	
			AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub") , caps);
			String id = "";
			//driver.findElementById(id).click();
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Clear");
			el1.click();
			MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("1");
			el2.click();
			MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Plus");
			el3.click();
			MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("9");
			el4.click();
			MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Equal");
			el5.click();
			
			el5.clear();
			String x = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.EditText";
			String A_result = driver.findElementByXPath(x).getText();
			System.out.println(A_result);
			String E_result = "11";
			
			if(A_result==E_result) {
				
				System.out.println("Passed: ");
			}
			else
			{
				System.out.println("Failed: ");
			}
			
			/*	MobileElement el6 = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/txtCalc");
			System.out.println("The result: "+el6);
			el6.clear();
			MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Clear");
			el7.click();*/
			
			System.out.println("End..");
			
		}	
}
