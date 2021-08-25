package linnbank.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import linnbank.utilities.ConfigurationReader;
import linnbank.utilities.Driver;

public class Registration_Step_Def {
    @Given(": User is on homepage")
    public void userIsOnHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("homepage_url"));
    }

//    @And("User clicks on the arrow on the right top corner")
//    public void userClicksOnTheArrowOnTheRightTopCorner() {
//    }
}
