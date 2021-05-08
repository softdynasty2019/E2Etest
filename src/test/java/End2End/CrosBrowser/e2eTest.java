package End2End.CrosBrowser;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class e2eTest {
	
	public String URL="https://setubabu25:ca19145a-3f90-49de-aa19-a3f9397af499@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	
	public WebDriver driver=null;
	
	
@BeforeClass	
@Parameters({"browser","version","platfrom"})
	
public void setup(String br,String vr,String pf) throws MalformedURLException {
	
	
	DesiredCapabilities cap=new DesiredCapabilities();
	
	cap.setCapability("browserName", br);
	cap.setCapability("platform", pf);
	cap.setCapability("version", vr);
	driver=new RemoteWebDriver(new java.net.URL(URL),cap);
	
}
	
	
@Test 
public void LoginFacebook() {
	
	driver.get("https://www.facebook.com/");
	driver.getTitle();
	
	
}
	
	
	
	

}
