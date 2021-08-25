package linnbank.stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank.pages.Gmi_HomePage;
import linnbank.pages.Gmi_RegistrationPage;
import linnbank.utilities.ConfigurationReader;
import linnbank.utilities.Driver;
import org.junit.Assert;

public class Registration_Step_Def {

    Gmi_HomePage homePage = new Gmi_HomePage();
    Gmi_RegistrationPage registrationPage = new Gmi_RegistrationPage();
    Faker faker = new Faker();
    @Given(": User is on homepage")
    public void userIsOnHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("homepage_url"));
    }

    @Given("user clicks on the webelement on the right top corner")
    public void user_clicks_on_the_webelement_on_the_right_top_corner() {
        homePage.right_icon.click();
    }
    @Then("user clicks on register")
    public void user_clicks_on_register() {
        homePage.registrationButton.click();
    }

    @Then("user puts a valid ssn")
    public void user_puts_a_valid_ssn() {
        registrationPage.ssn.sendKeys(faker.idNumber().ssnValid());
    }
    @Then("user puts a name")
    public void user_puts_a_name() {
        registrationPage.name.sendKeys(faker.name().firstName());
    }
    @Then("user puts a last name")
    public void user_puts_a_last_name() {
        registrationPage.lastname.sendKeys(faker.name().lastName());
    }
    @Then("user puts an address")
    public void user_puts_an_address() {
        registrationPage.address.sendKeys(faker.address().fullAddress());
    }
    @Then("user puts a phone number")
    public void user_puts_a_phone_number() {
        registrationPage.mobilePhoneNumber.sendKeys(faker.phoneNumber().cellPhone());
    }
    @Then("user puts a username")
    public void user_puts_a_username() {
        registrationPage.username.sendKeys(faker.superhero().name());
    }
    @Then("user puts an email")
    public void user_puts_an_email() {
        registrationPage.email.sendKeys(faker.internet().emailAddress());
    }
    @Then("user sets a password {string}")
    public void user_sets_a_password(String string) {
        registrationPage.password.sendKeys(string);
    }
    @Then("user confirm the password {string}")
    public void user_confirm_the_password(String string) {
        registrationPage.passwordConfirmation.sendKeys(string);
    }
    @Then("user completes registration by clicking on register button")
    public void user_completes_registration_by_clicking_on_register_button() {
        registrationPage.registerButton.click();
    }




}
