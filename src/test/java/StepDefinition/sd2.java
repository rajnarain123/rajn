//package StepDefinition;
//
//import org.openqa.selenium.WebDriver;
//
//import com.framework.org.CucumberFramework.base1;
//
//import Helper.Pom;
//import Helper.searchhotelpom;
//import Runner.RunnerEx;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class sd2 extends base1{
//	public static WebDriver driver = RunnerEx.driver;
//searchhotelpom sd2= new searchhotelpom(driver);
//	
//	@Given("^User Select options \"([^\"]*)\"  and select \"([^\"]*)\" as location details from dropdown box$")
//	public void user_Select_options_and_select_as_location_details_from_dropdown_box(String arg1, String arg2) throws Throwable {
//	   dropdown(sd2.getLocation(),arg1,0, arg2);
//	}
//
//	@When("^user Select options \"([^\"]*)\" and select \"([^\"]*)\" as Hotel name$")
//	public void user_Select_options_and_select_as_Hotel_name(String arg1, String arg2) throws Throwable {
//	    dropdown(sd2.getHotels(),arg1,0, arg2);
//	}
//
//	@When("^user select options \"([^\"]*)\" and select \"([^\"]*)\" as room type$")
//	public void user_select_options_and_select_as_room_type(String arg1, String arg2) throws Throwable {
//	   dropdown(sd2.getRoom_type(),arg1,0, arg2);
//	}
//
//	@When("^user select options \"([^\"]*)\" and select \"([^\"]*)\" as no of room$")
//	public void user_select_options_and_select_as_no_of_room(String arg1, String arg2) throws Throwable {
//	    dropdown(sd2.getRoom_nos(),arg1,0, arg2);
//	}
//
//	@When("^user enter Check in date as \"([^\"]*)\"$")
//	public void user_enter_Check_in_date_as(String arg1) throws Throwable {
//	   sendkeyz(sd2.getDatepick_in(),arg1);
//	}
//
//	@When("^user enter Check out date as \"([^\"]*)\"$")
//	public void user_enter_Check_out_date_as(String arg1) throws Throwable {
//	    sendkeyz(sd2.getDatepick_out(),arg1);
//	}
//
//	@When("^user Select options \"([^\"]*)\" and select \"([^\"]*)\" as choice$")
//	public void user_Select_options_and_select_as_choice(String arg1, String arg2) throws Throwable {
//	    dropdown(sd2.getAdult_room(),arg1, 0, arg2);
//	}
//
//	@When("^user Select options \"([^\"]*)\" and select \"([^\"]*)\" as choice as enter$")
//	public void user_Select_options_and_select_as_choice_as_enter(String arg1, String arg2) throws Throwable {
//		dropdown(sd2.getChild_room(),arg1, 0, arg2);
//	}
//
//	@Then("^user click search button to verify$")
//	public void user_click_search_button_to_verify() throws Throwable {
//	    click2(sd2.getSubmit());
//	}
//
//
//}
