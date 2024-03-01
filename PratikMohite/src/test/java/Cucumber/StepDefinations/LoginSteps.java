package Cucumber.StepDefinations;

import io.cucumber.java.en.*;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.out.print("Inside Step-user is on login page");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.print("Inside Step-user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.print("Inside Step-Click on login button ");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.print("Inside Step-user is navigated to home page");
	}
}
