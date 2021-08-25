package linnbank.pages;

import linnbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmi_ManageCustomerPage {
     public Gmi_ManageCustomerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

     @FindBy(xpath = "//span[contains(text(),'Create a new Customer')]")
     public WebElement createNewCustomerLink;

}
