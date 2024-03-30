package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	
	@Test(priority = 1)
	public void openBrowser()
	{
		Reporter.log("Browser opened", true);
	}
	
	@Test(priority = 3)
	public void login()
	{
		Reporter.log("logged in successfully", true);
	}
	@Test(priority = 2)
	public void register()
	{
		Reporter.log("Registered successfully", true);
	}
	

}
