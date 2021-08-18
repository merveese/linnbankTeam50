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
        @FindBy(xpath = "//a[@href='/account/reset/request']")
        public WebElement resertPasswordLink;
        //register new
        @FindBy(xpath = "(//a[@href='/account/register'])[2]")
        public WebElement registerNewAccountlink;
        // sign in button
        @FindBy(xpath = "//button[@type='submit']")
        public WebElement signInButton;

        @FindBy(xpath = "//span[contains(text(),'Cancel')]")
        public WebElement cancelButton;

        @FindBy(xpath = " //*[contains(text(),'Failed to sign in')]")
        public WebElement errorMessage;

       //(//p)[1] this is for "Enter the email address you used to register" for acpt creiteria5

    }

