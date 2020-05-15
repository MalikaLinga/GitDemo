package stepDefinitions;

import Cucumber.Automation.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest{

	
	@Before ("@MobileTest")
	
	public void Beforehook ()
	{
		System.out.println("Before Mobile Hook");
	}
	

	@After ("@MobileTest")
	
	public void Afterhook ()
	{
		System.out.println("After Mobile Hook");
	}
	
	@Before ("@WebTest")
	
	public void WebBeforehook ()
	{
		System.out.println("Before Web Hook");
	}
	
	@After ("@WebTest")
	
	public void WebAfterhook ()
	{
		System.out.println("After Web Hook");
	}
	@After ("@SeleniumTest")
	public void SeleniumTest()
	{
	driver.close();
	}
	
}

