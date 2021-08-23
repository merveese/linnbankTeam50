package linnbank.pages;

import linnbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmi_CreateACustomerPage {
    public Gmi_CreateACustomerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id="search-ssn")
    public WebElement searchSsnBox;
    @FindBy (xpath = "//*[contains(text(),'Search')]")
    public WebElement searchButton;
    @FindBy (xpath = "//*[contains(text(),'translation-not-found')]")
    public WebElement greenAlert;
    @FindBy (id="tp-customer-firstName")
    public WebElement firstNameBox;
    @FindBy (id="tp-customer-lastName")
    public WebElement lastNameBox;
    @FindBy (id="tp-customer-middleInitial")
    public WebElement middleInitialBox;
    @FindBy (id="tp-customer-email")
    public WebElement emailBox;
    @FindBy (id="tp-customer-mobilePhoneNumber")
    public WebElement mobileNumber;
    @FindBy (id="tp-customer-phoneNumber")
    public WebElement phoneNumber;
    @FindBy (id="tp-customer-zipCode")
    public WebElement zipCode;
    @FindBy (id="tp-customer-address")
    public WebElement address;
    @FindBy (id="tp-customer-city")
    public WebElement city;
    @FindBy (id="tp-customer-country")
    public WebElement country;
    @FindBy (id="tp-customer-state")
    public WebElement state;
    @FindBy (id="tp-customer-ssn")
    public WebElement customerssn;
    @FindBy (xpath = "//div[contains(text(),'This field is required')]")
    public WebElement fieldRequiredMessage;


}
