package Runner;




import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.framework.org.CucumberFramework.base1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\91936\\eclipse-workspace\\Selenium1\\CucumberFramework\\src\\test\\java\\com\\framework\\org\\cucumber",
				glue={"StepDefinition","hooks"},

				
				monochrome = true,
				strict = true,
				dryRun = false)
	public class RunnerEx {
		public static WebDriver driver;
		
		
		
		@BeforeClass
		public static void setUp() throws IOException {
			String browsername = FileReaderManager.getInstance().getCrInstance().getBrowserName();
			driver=base1.browserLaunch(browsername);
		}
		@AfterClass
		public static void tearDown() {
			driver.close();
		}
	}

 
