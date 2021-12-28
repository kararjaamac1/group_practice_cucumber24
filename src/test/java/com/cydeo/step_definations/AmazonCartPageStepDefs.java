package com.cydeo.step_definations;

import com.cydeo.pages.AmazonHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonCartPageStepDefs {
   static WebDriver driver;
     static {
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

         driver.manage().window().maximize();

     }

    @Given("User is on amazon home page")
    public void user_is_on_amazon_home_page() {
        driver.get("https://www.amazon.com/");

    }
    @When("User click Cart link")
    public void user_click_cart_link() {

        AmazonHomePage amazonHomePage= new AmazonHomePage(driver);
        amazonHomePage.cartLink.click();

    }
    @Then("User should go to Cart page")
    public void user_should_go_to_cart_page() {
        Assert.assertTrue(driver.getTitle().contains("Cart"));

    }


}
