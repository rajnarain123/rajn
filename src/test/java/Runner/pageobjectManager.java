package Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Helper.Finalpom;
import Helper.Pom;
import Helper.searchhotelpom;
import StepDefinition.S2;

public class pageobjectManager {
	
	public static WebDriver driver;
	private Pom lp;
	
	private searchhotelpom sh;
	
	private Finalpom fp;
	
	public pageobjectManager(WebDriver mdriver) {
	this.driver= mdriver;
	//PageFactory.initElements(mdriver, this);
	
	}
	
	public searchhotelpom getSh() {
		searchhotelpom sh = new searchhotelpom(driver);
		return sh;
	}

	public Finalpom getFp() {
		Finalpom fp= new Finalpom(driver);
		return fp;
	}

	public Pom getLp() {
		lp= new Pom(driver);
		return lp;
	}
	

}
