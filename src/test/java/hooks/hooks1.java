package hooks;

import java.io.IOException;

import com.framework.org.CucumberFramework.base1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks1 extends base1 {
	
	@Before
	public static void beforeHooks(Scenario scenario) {
		
		String status = scenario.getName();
		
		
		System.out.println(status);
		
	}
	
	@After
	public static void afterHooks(Scenario scenario) throws IOException{
	String status = scenario.getStatus();
	System.out.println(status);
	
	if(scenario.isFailed()) {
		Screenshot("C:\\Users\\91936\\eclipse-workspace\\Selenium1\\CucumberFramework\\screenshot\\k.png");
	}

}
}
