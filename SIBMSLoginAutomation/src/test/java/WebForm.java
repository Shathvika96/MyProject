import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class WebForm extends PageObject{

    private final String USER_NAME = "shathvika_k";
    private final String PASSWORD = "Shat@1145";
    private final String LOCATION = "Colombo";

    //username
    @FindBy(xpath= "//input[@formcontrolname = 'userName']")
    private WebElement txtuser_name;

//username
    @FindBy(xpath = "//input[@formcontrolname ='password']")
    private WebElement txtpassword;

    // click on dropdown
    @FindBy(xpath = "//div[@class='mat-select-arrow']")
    private WebElement btnLocationArrow;

//select location from dropdown
    @FindBy(xpath = "(//span[@class='location-dropdown-sub']/..)[1]")
   private WebElement baseLocation;

    //select from dropdown
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    private WebElement login_button;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterUserName(){
        waitUntil(txtuser_name);
        this.txtuser_name.sendKeys(USER_NAME); }

    public void enterPassword(){
        waitUntil(txtpassword);
        this.txtpassword.sendKeys(PASSWORD); }

    public void clickDropdown(){
       waitUntil(btnLocationArrow);
        this.btnLocationArrow.click();}

    public void enterLocation(){
    waitUntil(baseLocation);
    this.baseLocation.click();
    }
    public void pressLoginButton(){
       waitUntil(login_button);
        this.login_button.click();
        System.out.println("Successful Login");
    }

}