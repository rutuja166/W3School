package com.w3school.qa.stepdefinations;

import java.io.IOException;
import com.w3school.qa.pageobject.LoginPage;
import com.w3school.qa.testbase.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinations extends TestBase {

	LoginPage lp = new LoginPage(driver);

	static {
		try {
			initilization();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Given("^Navigate to \"([^\"]*)\"$")
	public void navigate_to_something(String strArg1) throws Throwable {
		driver.get(strArg1);

	}

	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\" and click on Login button$")
	public void enter_something_and_something_and_click_on_login_button(String strArg1, String strArg2)
			throws Throwable {
        lp.email(strArg1);
        lp.password(strArg2);
        lp.loginbutton();
	}

	@Then("^user should land on HomePage$")
	public void user_should_land_on_homepage() throws Throwable {

	}

}
