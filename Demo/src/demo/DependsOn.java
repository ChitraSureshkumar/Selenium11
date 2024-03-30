package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn 
{
	@Test
	public void openBrowser()
	{
		Reporter.log("Browser opened", true);
	}
	
	@Test(dependsOnMethods = "register")
	public void login()
	{
		Reporter.log("logged in successfully", true);
	}
	@Test
	public void register()
	{
		Reporter.log("Registered successfully", true);
	}
	
}
