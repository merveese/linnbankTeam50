package linnbank.pages;

import linnbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmi_ManagerHomePage {
    public Gmi_ManagerHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="entity-menu")
    public WebElement myOperationspopUp;
    @FindBy(xpath = "//*[contains(text(),'Manage Customers')]")
    public WebElement manageCustomers;
}
