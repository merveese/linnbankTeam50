package linnbank.pages;

import linnbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmi_RegistrationPage {
    public Gmi_RegistrationPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="ssn")
    public WebElement ssn;

    @FindBy(xpath = "//div[contains(text(), 'Your SSN is invalid')]")
    public WebElement invalidSsnFeedback;

    @FindBy(xpath = "//input[@name=\"firstname\"]")
    public WebElement name;

    @FindBy(xpath= "//div[contains(text(), 'Your First Name is required')]")
    public WebElement invalidNameFaadback;

    @FindBy(xpath= "//input[@name=\"lastname\"]")
    public WebElement lastname;

    @FindBy(xpath= "//div[contains(text(), 'Your Last Name is required')]")
    public WebElement invalidLastnameFeedback;

    @FindBy(id="address")
    public WebElement address;

    @FindBy(id="mobilephone")
    public WebElement mobilePhoneNumber;

    @FindBy(xpath="//div[contains(text(), 'Your mobile phone number is invalid')]")
    public WebElement invalidMobilePhoneNumberFeedback;

    @FindBy(xpath="//input[@name=\"username\"]")
    public WebElement username;

    @FindBy(xpath= "//div[contains(text(),'Your username is required.')]")
    public WebElement invalidUsernameFeedback;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(xpath= "//div[contains(text(),'Your email is required.')]")
    public WebElement invalidEmailFeedback;

    @FindBy(id= "firstPassword")
    public WebElement password;

    @FindBy(xpath="//div[contains(text(),'Your password is required.')]")
    public WebElement invalidPasswordFeedback;

    @FindBy(id="secondPassword")
    public WebElement passwordConfirmation;

    @FindBy(xpath= "//div[contains(text(),'confirmation')]")
    public WebElement invalidPasswordConfirmationFeedback;

    @FindBy(id= "register-submit")
    public WebElement registerButton;











}
