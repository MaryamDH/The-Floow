import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverInstatiation extends DesiredCap { // Inheritance
	
	private static RemoteWebDriver driver; //Encapsulation
	
	public WebDriver getDriver() throws Exception{		//encapsulation
        WebDriver driver= new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), super.getCap()); //Polymorphism
        //driver = new IOSDriver("URL", cap);
		return driver;
	}

}
