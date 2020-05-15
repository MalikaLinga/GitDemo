package stepDefinitions;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.CheckoutPage;
import pageobject.Homepage;

public class MyStepDefinitions extends BaseTest{
	
	
	public Properties prop;
	Homepage h;
	CheckoutPage cp;
	@Given("^User is on GreenKart landing page$")
	public void user_is_on_GreenKart_landing_page() throws Throwable {
	  
		driver= BaseTest.getdriver();
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//----Added the url in properties file
		
	}

	@When("^User searches for (.+) vegetable$")
	public void user_searches_for_vegetable(String arg1) throws Throwable {
	   
		h= new Homepage(driver);
		//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(arg1);
		h.getSearch().sendKeys(arg1);
		Thread.sleep(3000);
		
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void results_are_displayed(String arg1) throws Throwable {
		
		cp = new CheckoutPage(driver);
		
		Assert.assertTrue(cp.getproductname().getText().contains(arg1));
		//Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(arg1));
	    
	}


@And("^User add the items to cart$")
public void user_add_the_items_to_cart() throws Throwable {
	
	driver.findElement(By.xpath("//div[@class='products']//div[1]//div[2]//a[2]")).click();
	driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button[1]")).click();
	
	
       
}

@And("^User proceed to checkout page$")
public void user_proceed_to_checkout_page() throws Throwable {

	driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	
}

@Then("^veify selected (.+) is displayed in the checkout page$")
public void veify_selected_is_displayed_in_the_checkout_page(String arg1) throws Throwable {
	
	Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(arg1));
	
   
}
}