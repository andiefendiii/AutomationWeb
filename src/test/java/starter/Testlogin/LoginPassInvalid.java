package starter.Testlogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginPassInvalid {

    @Steps
    LoginSteps loginSteps;
    @Given("I am on the Login page2")
    public void i_am_on_the_Login_page2() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        loginSteps.openHomePage();
        loginSteps.openLoginPage();
    }

    @When("I enter my username valid and Password invalid")
    public void i_enter_my_username_valid_and_Password_Invalid() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        loginSteps.inputPasswordInvalid();
    }

    @When("I click {string} button2")
    public void i_click_button2(String string) {
        // Write code here that turns the phrase above into concrete actions
//      throw new cucumber.api.PendingException();
        // loginSteps.clickLogin2();
    }

    @Then("I cannot to the homepage2")
    public void i_cannot_to_the_homepage2() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

}
