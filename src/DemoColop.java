import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DemoColop {

	public static void main(String[] args) throws MalformedURLException {
		System.out.println("Start...");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "SABRESD-MX6DQ");
		caps.setCapability("udid", "101781d4ea9a1847"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.1.0");
		caps.setCapability("autoGrantPermissions", "true");
		caps.setCapability("appPackage", "unizen.jtiwestiform");
		caps.setCapability("appActivity", "unizen.jtiwestiform.activity.MainActivity");		
		caps.setCapability("noReset", "true");	
		System.out.println("midle..");
		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub") , caps);
		//String id = "";
		//driver.findElementById(id).click();
		
		System.out.println("End..");

	}
}
