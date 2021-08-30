package linnbank.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank.pages.LoginPage;
import linnbank.utilities.ConfigurationReader;
import linnbank.utilities.Driver;
import linnbank.utilities.ReusableMethods;
import org.testng.Assert;

public class LoginStep {

    LoginPage loginPage = new LoginPage();

    @Given("user goes to login page")
    public void user_goes_to_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("bankURL"));
//        loginPage.loginDropdown.click();
        Driver.waitAndClick(loginPage.loginDropdown,5);
        loginPage.signInButton.click();
    }

    @Given("user provides username {string} and password {string}")
    public void user_provides_username_and_password(String username, String password) {
        Driver.waitAndSendKeys(loginPage.username,username,5);
        Driver.waitAndSendKeys(loginPage.password,password,5);
    }

    @Then("user logs in")
    public void user_logs_in() {
        Driver.waitAndClick(loginPage.loginButton,5);
    }

    @Given("user logins as {string}")
    public void user_logins_as(String role) {
        String username="", password="";
        if(role.equals("user")){
            username=ConfigurationReader.getProperty("userName");
            password=ConfigurationReader.getProperty("userPassword");
        }else if(role.equals("admin")){
            username=ConfigurationReader.getProperty("adminName");
            password=ConfigurationReader.getProperty("adminPassword");
        }else if(role.equals("manager")){
            username=ConfigurationReader.getProperty("managerName");
            password=ConfigurationReader.getProperty("managerPassword");
        }else if(role.equals("employee")){
            username=ConfigurationReader.getProperty("employeeName");
            password=ConfigurationReader.getProperty("employeePassword");
        }
        Driver.waitAndSendKeys(loginPage.username,username,5);
        Driver.waitAndSendKeys(loginPage.password,password,5);
    }


    @Then("user validates successful login with sign out")
    public void user_validates_successful_login_with_sign_out() {


        Assert.assertTrue(loginPage.validateSignOutLink());
        ReusableMethods.hover(loginPage.signOutLink);
        loginPage.signOutLink.click();

    }

    @Then("user clicks cancel button")
    public void user_clicks_cancel_button() {
        loginPage.clickCancelBtn();
    }

    @Then("user validates return to homepage")
    public void user_validates_return_to_homepage() {
        Assert.assertTrue(loginPage.validateCancelBtnVisibility());
    }
}
