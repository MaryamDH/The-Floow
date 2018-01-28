import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginApplication {
	
	public void login(RemoteWebDriver driver){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementById("com.thefloow.flo:id/btn_agree").click();
        driver.findElementById("com.thefloow.flo:id/edit_text_email").sendKeys("Thefloow.app@gmail.com");
        driver.findElementById("com.thefloow.flo:id/edit_text_password").sendKeys("Thefloowapp123");
        driver.findElementById("com.thefloow.flo:id/btn_login").click();
	}	
	
}
