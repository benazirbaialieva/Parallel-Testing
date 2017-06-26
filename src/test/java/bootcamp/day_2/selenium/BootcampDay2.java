package bootcamp.day_2.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.cbt.utilities.Config;
import com.cbt.utilities.Driver;

public class BootcampDay2 {

	@Before
	public void setUp() throws Exception {
//		System.out.println(Config.getProperty("browser"));
//		System.out.println(Config.getProperty("chrome"));
		WebDriver driver = Driver.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		Driver.closeDriver();
	}

	@Test
	public void test() {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		
		System.out.println(caps.getVersion());
		System.out.println(caps.getBrowserName());
	}

}
