package linnbank.stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank.pages.Gmi_HomePage;
import linnbank.pages.Gmi_RegistrationPage;
import linnbank.utilities.ConfigurationReader;
import linnbank.utilities.Driver;
import org.testng.Assert;

public class Invalid_Registration_Step_Def {
    Gmi_HomePage homePage = new Gmi_HomePage();
    Gmi_RegistrationPage registrationPage = new Gmi_RegistrationPage();
    @Given("user click on registration page")
    public void user_click_on_registration_page() {

    }

        @Then("blank ssn")
        public void blank_ssn() {
        registrationPage.ssn.sendKeys("");
        Assert.assertEquals(registrationPage.invalidSsnFeedback.getText(),"Your SSN is invalid");
        }

         @Then("blank name")
        public void blank_name() {
            registrationPage.name.sendKeys(" ");
             Assert.assertEquals(registrationPage.invalidNameFaadback.getText(),"Your First Name is required");
        }
        @Then("blank last name")
        public void blank_last_name() {
            registrationPage.lastname.sendKeys("");
            Assert.assertEquals(registrationPage.invalidLastnameFeedback.getText(),"Your Last Name is required");

        }
        @Then("blank phone number")
        public void blank_phone_number() {
        registrationPage.mobilePhoneNumber.sendKeys("");
            Assert.assertEquals(registrationPage.invalidMobilePhoneNumberFeedback.getText(),"Your mobile phone number is invalid");
         }
         @Then("blank username")
        public void blank_username() {
        registrationPage.username.sendKeys("");
            Assert.assertEquals(registrationPage.invalidUsernameFeedback.getText(),"Your username is invalid.");
        }
        @Then("blank email")
        public void blank_email() {
            registrationPage.email.sendKeys("");
            Assert.assertEquals(registrationPage.invalidEmailFeedback.getText(),"This field is invalid");

        }
         @Then("user sets a password")
         public void user_sets_a_password() {
          registrationPage.password.sendKeys(" ");
          Assert.assertEquals(registrationPage.invalidPasswordFeedback.getText(),"Your password is required.");
        }
        @Then("the blank confirm the password")
        public void the_blank_confirm_the_password() {
        registrationPage.passwordConfirmation.sendKeys(" ");
        Assert.assertEquals(registrationPage.invalidPasswordConfirmationFeedback.getText(),"Your confirmation password is required.");

}

}
