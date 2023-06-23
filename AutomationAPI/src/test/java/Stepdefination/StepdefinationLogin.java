package Stepdefination;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepdefinationLogin {

	
	@Given("Add place payload")
	public void add_place_payload() {
	    // Write code here that turns the phrase above into concrete actions

		System.out.println("This is done");
	}
	
	@Given("user is on login page")
	public void loginpage() throws Throwable
{
		System.out.println("given");
	}

	@When("entered username and password")
	public void credentials()throws Throwable

	{
		System.out.println("when");
	}

	@Then("home page is displayed")
	public void homepagedisplay()throws Throwable

	{
		System.out.println("then");
	}

	@And("^cards are displayed$")
	public void cards()throws Throwable

	{
		System.out.println("and");
	}

}
