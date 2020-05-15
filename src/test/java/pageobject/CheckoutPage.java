package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	
	
	WebDriver driver;
	public  CheckoutPage(WebDriver driver) {
	this.driver=driver;
	}
	
	By search =  By.cssSelector("h4.product-name");

	
	public WebElement getproductname() {
		
		return driver.findElement(search);
	}
}
