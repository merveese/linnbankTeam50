package linnbank.stepdefinitions;

import io.cucumber.java.en.Given;
import linnbank.utilities.ConfigurationReader;
import linnbank.utilities.Driver;

public class SampleStepdefs {

    @Given("user on home page")
    public void user_on_home_page() {
       // System.out.println("Hello WORLD");
        System.out.println(ConfigurationReader.getProperty("homepage_url"));
        Driver.getDriver().get(ConfigurationReader.getProperty("homepage_url"));

    }


}
