package StepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.adactin.helper.FileReaderManager;
import com.framework.org.CucumberFramework.base1;

import Helper.Finalpom;
import Helper.Pom;
import Helper.searchhotelpom;
import Runner.RunnerEx;
import Runner.pageobjectManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class S2 extends base1 {
	public static WebDriver driver = RunnerEx.driver;
	pageobjectManager pom = new pageobjectManager(driver);

	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		String url= FileReaderManager.getInstance().getCrInstance().getUrl();
		geturl(url);
	}

	@When("^User enters the username$")
	public void user_enters_the_username() throws Throwable {
		sendkeyz(pom.getLp().getName(),"Sowmiyasri");
	}

	@When("^User enters the password$")
	public void user_enters_the_password() throws Throwable {
		sendkeyz(pom.getLp().getPassword(),"Sowmiya05");
	}

	@Then("^User validates the username and password$")
	public void user_validates_the_username_and_password() throws Throwable {
		click2(pom.getLp().getLogin());
	}

	

	@Given("^User select Location$")
	public void user_select_Location() throws Throwable {
		dropdown(pom.getSh().getLocation(), "byValue", "Sydney");
	}

	@When("^user select Hotel name$")
	public void user_select_Hotel_name() throws Throwable {
		dropdown(pom.getSh().getHotels(), "byvalue", "Hotel Creek");
		//dropdown(sh.getHotels(), null, null);
	//	Select s=new Select(sh.getHotels());
	//	s.selectByValue("Hotel creek");
	}

	@When("^user select room type$")
	public void user_select_room_type() throws Throwable {
		dropdown(pom.getSh().getRoom_type(),"byValue","Standard");
	}

	@When("^user select no of room$")
	public void user_select_no_of_room() throws Throwable {
		dropdown(pom.getSh().getRoom_nos(),"byValue","5");
	}

	@When("^user enter Check in date$")
	public void user_enter_Check_in_date() throws Throwable {
		sendkeyz(pom.getSh().getDatepick_in(), "31/03/2021");
	}

	@When("^user enter Check out date$")
	public void user_enter_Check_out_date() throws Throwable {
		sendkeyz(pom.getSh().getDatepick_out(), "03/04/2021");
	}

	@When("^user Select no\\.of adults$")
	public void user_Select_no_of_adults() throws Throwable {
		dropdown(pom.getSh().getAdult_room(),"byvalue", "2");
	}

	@When("^user Select no\\.of childrens$")
	public void user_Select_no_of_childrens() throws Throwable {
		dropdown(pom.getSh().getChild_room(),"byvalue", "1");
	}

	@Then("^user click search button to verify$")
	public void user_click_search_button_to_verify() throws Throwable {
		click2(pom.getSh().getSubmit());

	}
	
	
	
	@Given("^user click radio button$")
	public void user_click_radio_button() throws Throwable {
		Thread.sleep(10000);
	   //driver.findElement(By.id("radiobutton_0")).click();
	  click2(pom.getFp().getRb());
	}
	@When("^user enter continue button$")
	public void user_enter_continue_button() throws Throwable {
	    click2(pom.getFp().getCont());
	}

	@When("^user enter \"([^\"]*)\" as user name$")
	public void user_enter_as_user_name(String arg1) throws Throwable {
	    sendkeyz(pom.getFp().getFn(),arg1);
	    
	}

	@When("^user enter \"([^\"]*)\" as last name$")
	public void user_enter_as_last_name(String arg1) throws Throwable {
	    sendkeyz(pom.getFp().getLn(),arg1);
	    
	}

	@When("^user enter \"([^\"]*)\" as address$")
	public void user_enter_as_address(String arg1) throws Throwable {
	  sendkeyz(pom.getFp().getAd(),arg1);
	   
	}

	@When("^user enter \"([^\"]*)\" as credit card number$")
	public void user_enter_as_credit_card_number(String arg1) throws Throwable {
	    sendkeyz(pom.getFp().getCc(),arg1);
	    
	}

	@When("^user Select options \"([^\"]*)\" and select \"([^\"]*)\" as answer$")
	public void user_Select_options_and_select_as_answer(String arg1, String arg2) throws Throwable {
	    dropdown(pom.getFp().getCct(),arg1 ,arg2);
	    
	}

	@When("^user Select options \"([^\"]*)\" and select \"([^\"]*)\" as no$")
	public void user_Select_options_and_select_as_no(String arg1, String arg2) throws Throwable {
	    dropdown(pom.getFp().getCcm(),arg1,arg2);
	    
	    
	}

	@When("^user select options \"([^\"]*)\" and Select \"([^\"]*)\" as year$")
	public void user_select_options_and_Select_as_year(String arg1, String arg2) throws Throwable {
	    dropdown(pom.getFp().getCey(),arg1,arg2);
	    
	    Assert.assertEquals("yfyy", "kjiji");
	    
	}

	@When("^user enter \"([^\"]*)\" as CVV No$")
	public void user_enter_as_CVV_No(String arg1) throws Throwable {
	   sendkeyz(pom.getFp().getCvv(),arg1);
	    
	}

	@When("^user click BOOK click button$")
	public void user_click_BOOK_click_button() throws Throwable {
	    click2(pom.getFp().getBn());
	  
	}

	@When("^user click logo Button$")
	public void user_click_logo_Button() throws Throwable {
	    click2(pom.getFp().getLogo());
	}





}
