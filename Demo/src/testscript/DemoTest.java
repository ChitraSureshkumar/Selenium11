package testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Base;

public class DemoTest extends Base
{
      @Test
      public void addAddress()
      {
    	  Reporter.log("address added successfully", true );
      }
      
      @Test
      public void deleteAddress()
      {
    	  Reporter.log("address deleted successfully", true);
      }
}