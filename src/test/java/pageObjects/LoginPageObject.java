package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject
{
    WebDriver driver;
    @FindBy(id = "lemail")
   private WebElement username_field;

    @FindBy(id = "password")
   private WebElement password_field;

    @FindBy(xpath = "//h2")
    public WebElement text;

    @FindBy(xpath = "//*[@id=\"passwordFields\"]/div[3]/button")
    private WebElement login_button;

    public void enter_username(String usernameText)
    {
        username_field.sendKeys(usernameText);
    }
    public void enter_password(String passwordText)
    {
        password_field.sendKeys(passwordText);
    }
    public void clickLogin()
    {
        login_button.click();
    }
    public void message()
    {
        text.getText();
    }


   public LoginPageObject(WebDriver driver)
   {
       this.driver = driver;
       PageFactory.initElements(driver,this);
   }
}
