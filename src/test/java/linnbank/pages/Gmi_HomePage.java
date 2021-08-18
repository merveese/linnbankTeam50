package linnbank.pages;

import linnbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmi_HomePage {
    public Gmi_HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //right top corner icon
    @FindBy(id = "account-menu")
    public WebElement right_icon;
    //sign in button
    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    public WebElement signInButton;
}
