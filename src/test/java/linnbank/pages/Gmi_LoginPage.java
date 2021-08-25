package linnbank.pages;

import linnbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmi_LoginPage {

        public Gmi_LoginPage(){
            PageFactory.initElements(Driver.getDriver(), this); }
        //username textbox
        @FindBy(id = "username")
        public WebElement username;
        //password textbox
        @FindBy(id = "password")
        public WebElement password;
        //reset password
        @FindBy(xpath = "//span[contains( text(),'forget')]")
        public WebElement resertPasswordLink;
        //register new
        @FindBy(xpath = "//*[contains(text(),'Register a new account')]")
        public WebElement registerNewAccountlink;
        // sign in button
        @FindBy(xpath = "//button[@type='submit']")
        public WebElement signInButton;

        @FindBy(xpath = "//span[contains(text(),'Cancel')]")
        public WebElement cancelButton;

        @FindBy(xpath = " //*[contains(text(),'Failed to sign in')]")
        public WebElement errorMessage;
 }

