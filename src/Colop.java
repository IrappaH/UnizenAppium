import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Colop {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		System.out.println("Start...");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Irappa");
		caps.setCapability("udid", "RZ8M519H1SH"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("autoGrantPermissions", "true");
		/*caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		caps.setCapability("appActivity", "com.sec.android.app.popupcalculator");	*/	
		caps.setCapability("noReset", "true");		
		
		caps.setCapability("appPackage", "com.colop.colopemark");
		caps.setCapability("appActivity", "md5aab464f856b05ae625ba8153f40a8758.MainSplashActivity");
		caps.setCapability("noReset", "true");	
		
		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub") , caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"WizBNxt\"]").click();
		System.out.println("Next Button clicked");
		String chkbx ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView";
		driver.findElementByXPath(chkbx).click();

		String cntn="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.Button";
		driver.findElementByXPath(cntn).click();
		System.out.println("continue  Button clicked");
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		/*String x1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.ImageView";
		//wait.until(ExpectedConditions.textToBePresentInElement().	Please find the e-mark ssid and password in the Quick Setup Guide!)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(x1 )));
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View/android.widget.TextView").click();
		System.out.println("Clicked on check box and  ...");*/
		
		String x2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.widget.Button";
		driver.findElementByXPath(x2).click();
		System.out.println("Clicked on Continue without connection to emark...");
		
		String x3 = "(//android.widget.Button[@content-desc=\"WizBNxt\"])[2]";
		Thread.sleep(3000);
		driver.findElementByXPath(x3).click();
		System.out.println("Clicked on Next without ...");
		String xx1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.widget.TextView";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xx1  )));
		String x4 = "(//android.widget.Button[@content-desc=\"WizBNxt\"])[3]";
		             //(//android.widget.Button[@content-desc="WizBNxt"])[3]
		Thread.sleep(5000);
		driver.findElementByXPath(x4).click();
		System.out.println("Clicked on Finish button ...");
		String menu = "//android.widget.ImageButton[@content-desc=\"OK\"]";
		Thread.sleep(5000);
		driver.findElementByXPath(menu).click();
		System.out.println("Clicked on menu button");
		
		String connToeMrk = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.TextView";
				
		String myImpbtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.widget.LinearLayout[2]/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView";
		
		String xx2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View/android.view.View/android.view.View/android.widget.TextView";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xx2  )));
		
		//Create Imprints 
		String NewImp = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView";
		Thread.sleep(5000);
		String NImp = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.ListView/android.widget.LinearLayout/android.view.View/android.view.View/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]";

		driver.findElementByXPath(NImp).click();
		System.out.println("Clicked on myImpbtn button");
		
		String Addtab = "//android.view.View[@content-desc=\"CHK_NewImprintPage\"]/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.widget.LinearLayout[1]/android.view.View/android.view.View/android.view.View[2]/android.widget.FrameLayout/android.view.View/android.view.View[1]/android.widget.ImageView";
		Thread.sleep(5000);
		driver.findElementByXPath(Addtab).click();
		System.out.println("Clicked on Addtab  button");
		
		String selectimg = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.widget.LinearLayout[1]/android.view.View/android.view.View/android.view.View/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ImageView";
		Thread.sleep(5000);
		driver.findElementByXPath(selectimg).click();
		System.out.println("Clicked on selectimg  button");
		
		String save = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView[2]";
		Thread.sleep(5000);
		driver.findElementByXPath(save).click();		
		System.out.println("Clicked on save  button");
		
		String edittext = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText";
		Thread.sleep(2000);
		driver.findElementByXPath(edittext).sendKeys("Irappa");
		System.out.println("Clicked on edittext  button");
		
		String edittext_save = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]";
		Thread.sleep(2000);
		driver.findElementByXPath(edittext_save).click();
		System.out.println("Clicked on edittext_save  button");
		
		String emark = "//android.widget.TextView[@content-desc=\"Save and add to print queue\"]";
		Thread.sleep(2000);
		driver.findElementByXPath(emark).click();
		System.out.println("Clicked on emark  button");
		
		
		
		String Setting = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.widget.LinearLayout[4]/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView";
		
		
		
		
		
		
		System.out.println("END ...");
		
	}

}
