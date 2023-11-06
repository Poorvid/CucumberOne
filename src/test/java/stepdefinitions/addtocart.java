package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class addtocart {

    WebDriver driver;

  //  String itemName;

    @Given("the user is logged into Swaglabs")
    public void the_user_is_logged_into_swaglabs() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
    @When("the user clicks on the add to cart button for an item")
    public void the_user_clicks_on_the_add_to_cart_button_for_an_item() {

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

    }
    @Then("the item should get added to the cart")
    public void the_item_should_get_added_to_the_cart() {

        //driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
      //  String cartItemName=driver.findElement(By.className("inventory_item_name")).getText();
      //  Assert.assertEquals(cartItemName, "Sauce Labs Bike Light");
       // driver.quit();
        driver.findElement(By.className("shopping_cart_link")).click();

        // Verify if the cart is not empty
        WebElement cartNotEmptyMessage = driver.findElement(By.xpath("//div[@class='cart_list']"));

        Assert.assertTrue(cartNotEmptyMessage.isDisplayed(), "Cart is empty.");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



