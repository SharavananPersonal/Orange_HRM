package step_defenition;

import base_Package.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom_class.Login_Page_WebElements;

public class Defenition_of_Feature_file extends Driver {
	
	
	Login_Page_WebElements lpw;
	
	@Given("^The user is in the login page$")
	public void the_user_is_in_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Chrome_Driver();
		lpw =new Login_Page_WebElements();
		lpw.open_orange_hrm();
	}

	@When("^The user enter the username$")
	public void the_user_enter_the_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	  lpw.username_textbox();
	}

	@When("^The user enters the password$")
	public void the_user_enters_the_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	  lpw.password_textbox();
	}

	@Then("^The user clicks the login button$")
	public void the_user_clicks_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	   lpw.click_login_button();
	}

}
