package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginpagesteps {

    WebDriver driver;


    @Given("the user is on the login page")
    public void the_registered_user_is_on_the_login_page() throws Throwable{

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
         driver.get("https://www.saucedemo.com/");

    }

    @When("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username , String password) throws Throwable {

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        System.out.println(username);
        System.out.println(password);

    }

    
   @Then("the user should receive {string}")
    public void the_user_should_receive(String string) throws Throwable {


        String actualURL= driver.getCurrentUrl();
        System.out.println("URL before login - " + actualURL);
        String expectedURL = "https://www.saucedemo.com/inventory.html";

        Assert.assertEquals(actualURL, expectedURL );


       driver.quit();


    }

}
