package org.stepdefinition;

import org.sam.Baseclass;
import org.sam.Fbpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveandNegative extends Baseclass {

	Fbpojo f;

@Given("To launch the chrome browser and maximise window")
public void to_launch_the_chrome_browser_and_maximise_window() {
   launchBrowser();
   WindowMaximize();
}

@When("To launch the url of the facebook application")
public void to_launch_the_url_of_the_facebook_application() {
   launchUrl("https://en-gb.facebook.com/");
}

@When("To pass valid username in email field")
public void to_pass_valid_username_in_email_field(String em) {
    f = new Fbpojo();
    passText(em, f.getEmail());
    		
}

@When("To pass invalid password in password field")
public void to_pass_invalid_password_in_password_field(String pass) {
    f = new Fbpojo();
    passText(pass, f.getPassword());
}

@When("To click the login button")
public void to_click_the_login_button() {
    
}

@When("To check whether navigate to home page or not")
public void to_check_whether_navigate_to_home_page_or_not() {
   
}

@Then("To close the browser")
public void to_close_the_browser() {
  closeEntireBrowser();
}


}
