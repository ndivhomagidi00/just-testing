package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPageObject;

public class loginStep
{
    WebDriver driver;
    LoginPageObject loginPageObject;

    @Given("^I navigate to the site$")
    public void navigate()
    {
        driver = new ChromeDriver();
        driver.get("https://inspiredtesting.bamboohr.com/login.php?r=%2Fperformance%2F706%2Fassessments");
        driver.manage().window().maximize();

        loginPageObject= new LoginPageObject(driver);

    }

    @Then("I capture {string} and {string}")
    public void iCaptureAnd(String username, String password)
    {
      loginPageObject.enter_username(username);
      loginPageObject.enter_password(password);
    }

    @Then("I click login button")
    public void iClickLoginButton()
    {
        loginPageObject.clickLogin();
    }

    @And("I see the actual message")
    public void iSeeTheActualMessage()
    {
        String expected_text_message = "2-Step Login Required";
        String actual = loginPageObject.text.getText();

        //validations
        Assert.assertEquals(expected_text_message,actual);
        driver.quit();
    }
}//End of login test
