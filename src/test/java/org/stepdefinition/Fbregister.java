package org.stepdefinition;

import io.cucumber.datatable.*;

import java.util.List;

import org.sam.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbregister extends Baseclass {
	Singin s;

	@Given("To launch the browser and maximise the window.")
	public void to_launch_the_browser_and_maximise_the_window() {
		launchBrowser();
		WindowMaximize();
	}

	@When("To launch url of fb app.")
	public void to_launch_url_of_fb_app() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new account button.")
	public void to_click_the_create_new_account_button() {
		s = new Singin();
	
	}

	@When("To pass firstname in firstname text box.")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		s = new Singin();
		Thread.sleep(3000);
		List<String> l = d.asList();
		passText(l.get(2),s.getFirstnametxtbox());
	}

	@When("To pass secondname in secondname text box.")
	public void to_pass_secondname_in_secondname_text_box() {
		s = new Singin();
passText("Inmakes", s.getSecondnamebox());
		
	}

	@When("To pass mobile number or email in email text box.")
	public void to_pass_mobile_number_or_email_in_email_text_box(DataTable d) {
		s = new Singin();
		List<List<String>> l= d.asLists();
passText(l.get(1).get(2), s.getMobileoremail());
	}

	@When("To create the new password using new password text box.")
	public void to_create_the_new_password_using_new_password_text_box() {
		s = new Singin();
passText("jaihind",s.getPassword());
	}

	@Then("to closse the chrome browser.")
	public void to_closse_the_chrome_browser() {
		//closeEntireBrowser();
	    
	}

	
	
}
