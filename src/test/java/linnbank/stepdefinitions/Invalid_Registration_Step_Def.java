package linnbank.stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import linnbank.pages.Gmi_HomePage;
import linnbank.pages.Gmi_RegistrationPage;
import linnbank.utilities.ConfigurationReader;
import linnbank.utilities.Driver;

public class Invalid_Registration_Step_Def {
    @Given("user click on registration page")
    public void user_click_on_registration_page() {
        Gmi_HomePage homePage = new Gmi_HomePage();
        Gmi_RegistrationPage registrationPage = new Gmi_RegistrationPage();
        Faker faker = new Faker();

    }


}
