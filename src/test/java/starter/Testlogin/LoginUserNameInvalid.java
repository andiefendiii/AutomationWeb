package starter.Testlogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginUserNameInvalid {

    @Steps
    LoginSteps loginSteps;
    @Given("I am on the Login page1")
    public void i_am_on_the_Login_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        loginSteps.openHomePage();
        loginSteps.openLoginPage();
    }

    @When("I enter my username invalid and Password valid")
    public void i_enter_my_username_and_Password_correctly() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        loginSteps.inputUserInvalid();
    }

    @When("I click {string} button1")
    public void i_click_button1(String string) {
        // Write code here that turns the phrase above into concrete actions
//      throw new cucumber.api.PendingException();
        // loginSteps.clickLogin2();
    }

    @Then("I cannot to the homepage")
    public void i_cannot_to_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }


}

