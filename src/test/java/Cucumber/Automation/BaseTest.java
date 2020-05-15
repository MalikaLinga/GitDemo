package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	
	public static WebDriver getdriver () throws IOException {
		
		System.out.println("BaseTest");
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("E:\\Selenium\\Malika\\Automation\\src\\test\\java\\Cucumber\\Automation\\global.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(prop.getProperty("url"));
		return driver;
		
		
		
}
}




