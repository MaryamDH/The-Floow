import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Install {
	
	public static RemoteWebDriver driver;
	public static LoginApplication loginApp ;

	public static void main(String[] args) throws Exception {

		DriverInstatiation driverClass = new DriverInstatiation(); //polymorphism
		driver = (RemoteWebDriver) driverClass.getDriver();
		
		//login into application
		loginApp = new LoginApplication();
		loginApp.login(driver);
		

        driver.findElementById("com.thefloow.flo:id/btn_welcome_close").click();
        driver.findElementById("com.thefloow.flo:id/btn_start").click();
        driver.findElementById("com.thefloow.flo:id/btn_cancel_gps").click();
        driver.findElementById("com.thefloow.flo:id/tab_social").click();
        driver.findElementById("com.thefloow.flo:id/social_menu_my_profile").click();
        driver.findElementById("com.thefloow.flo:id/btn_edit_my_profile").click();
        driver.findElementById("com.thefloow.flo:id/my_profile_photo").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Camera']").click();
        driver.findElementById("com.android.camera:id/shutter_button").click();
        driver.findElementById("com.android.camera:id/btn_done").clear();
        //driver.findElementById("com.thefloow.flo:id/my_profile_name_edit").sendKeys("Maryam DH");

        driver.findElementById("com.thefloow.flo:id/my_profile_name_edit").sendKeys("Maryam DH: Love gives you hope;hope builds faith;faith brings you closer to God.Keep loving,keep hoping,and alwaysFAITH IN GOD :)");
        driver.findElementById("com.thefloow.flo:id/btn_save_my_profile").click();
        //driver.findElementByXPath("//android.widget.TextView[@resource-id='com.thefloow.flo:id/my_profile_about_me']").click();
        //sendKeys("Love gives you hope;hope builds faith;faith brings you closer to God.Keep loving,keep hoping,and alwaysFAITH IN GOD.");
        
		
	}
}
