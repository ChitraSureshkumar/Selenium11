package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Base;

public class AddAddress extends Base
{
    @Test
    public void addAddress() throws Throwable
    {Thread.sleep(3000);
    Reporter.log("Address added successfully" , true);
    }
}

class DeleteAddress extends Base
{
    @Test
    public void deleteAddress() throws Throwable
    {Thread.sleep(3000);
    Reporter.log("Address deleteded successfully" , true);
    }
}

class UpdateAddress extends Base
{
    @Test(groups = "Smoke")
    public void updateAddress() throws Throwable
    {Thread.sleep(3000);
    Reporter.log("Address updated successfully" , true);
    }
}
