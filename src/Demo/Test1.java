package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 
{
@Test
public void launch() throws Exception
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
	WebDriver driver=new FirefoxDriver();
	
}
}
