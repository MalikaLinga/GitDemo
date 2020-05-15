package stepDefinitions;

import java.util.List;

import Cucumber.Automation.NewClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions extends NewClass{
	
	@Given("^Validate the Browser$")
	public void validate_the_Browser() throws Throwable {
	  System.out.println("Check the browser");
	  
	  System.out.println(x);
	}
	
	

	@When("^Browser is trigged$")
	public void browser_is_trigged() throws Throwable {
	System.out.println("Browser is trigged");
	}

	@Then("^check if browser is displayed$")
	public void check_if_browser_is_displayed() throws Throwable {
	 System.out.println("Browser is displayed");
	 System.out.println("Browser");
	 System.out.println("Browser is ");
	}
	
	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_and_password(String arg1, String arg2) throws Throwable {
		System.out.println(arg1);
		System.out.println(arg2);
	   
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("On Home page");
	    
	}

	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Throwable {
		System.out.println(arg1);
		
	}
	@When("^User sign up with following details$")
	public void user_sign_up_with_following_details(DataTable arg1) throws Throwable {
		List<List<String>>  obj=arg1.raw();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
	}

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("On landing page");
	    
	}
	
	@When("^User login in to application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password1(String username, String password) throws Throwable {
       System.out.println(username);
       System.out.println(password);
       
    }
	
	

}