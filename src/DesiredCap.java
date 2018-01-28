import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCap {
	public static DesiredCapabilities cap;
	
	public static DesiredCapabilities getCap(){
	cap = new DesiredCapabilities();
    cap.setCapability("deviceName", "emulator-5554");
    cap.setCapability("platformVersion", "7.1.1");
    cap.setCapability("platformName", "Android");
    cap.setCapability(CapabilityType.BROWSER_NAME, "");
    cap.setCapability("app", "C:\\Users\\Kiran\\workspace\\The Floow\\src\\FloowApk.apk");
    return cap;
}
}
