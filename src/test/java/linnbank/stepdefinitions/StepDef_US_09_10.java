package linnbank.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linnbank.pages.Gmi_CreateACustomerPage;
import linnbank.pages.Gmi_ManageCustomerPage;
import linnbank.pages.Gmi_ManagerHomePage;
import linnbank.utilities.Driver;
import linnbank.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.management.ValueExp;

public class StepDef_US_09_10 {
    Gmi_ManagerHomePage managerHomePage = new Gmi_ManagerHomePage();
    Gmi_ManageCustomerPage customersPage = new Gmi_ManageCustomerPage();
    Gmi_CreateACustomerPage createACustomer=new Gmi_CreateACustomerPage();

    @Given("user click on manage customer link")
    public void userClickOnManageCustomerLink() {
        managerHomePage.myOperationspopUp.click();
        ReusableMethods.waitForVisibility(managerHomePage.manageCustomers, 5);
        managerHomePage.manageCustomers.click();
    }

    @Then("user click on create a new user button")
    public void userClickOnCreateANewUserButton() {
        customersPage.createNewCustomerLink.click();
    }
    @When("user write SSN of customer and click on search button{string}")
    public void userWriteSSNOfCustomerAndClickOnSearchButton(String arg0) {
        createACustomer.searchSsnBox.sendKeys(arg0);
        createACustomer.searchButton.click();
    }
    @Then("green alert show up")
    public void greenAlertShowUp() {
        ReusableMethods.waitForVisibility(createACustomer.greenAlert,2);
        Assert.assertTrue(createACustomer.greenAlert.isDisplayed());
    }

    @Then("verify firstname is exist same as registration info{string}")
    public void verifyFirstnameIsExistSameAsRegistrationInfo(String expecteddata) {
      String firstname = createACustomer.firstNameBox.getAttribute("value");
        Assert.assertEquals(expecteddata,firstname);
    }
     @Then("verify lastname is exist same as registration info{string}")
    public void verifyLastnameIsExistSameAsRegistrationInfo(String expect) {
        String lastname = createACustomer.lastNameBox.getAttribute("value");
        Assert.assertEquals(expect,lastname);
    }
    @Then("verify address is exist {string}")
    public void verifyAddressIsExist(String expect) {
        String address = createACustomer.address.getAttribute("value");
        Assert.assertEquals(expect,address);
    }
    @Then("verify mobile number is exist{string}")
    public void verifyMobileNumberIsExist(String expect) {
        String mobilenum = createACustomer.mobileNumber.getAttribute("value");
        Assert.assertEquals(expect,mobilenum);
    }
    @Then("verify ssn is exist{string}")
    public void verifySsnIsExist(String expect) {
        String customerSsn = createACustomer.customerssn.getAttribute("value");
        Assert.assertEquals(expect,customerSsn);
    }
    @Then("verify email is exist{string}")
    public void verifyEmailIsExist(String expect) {
        String email = createACustomer.emailBox.getAttribute("value");
        Assert.assertEquals(expect,email);
    }


}
