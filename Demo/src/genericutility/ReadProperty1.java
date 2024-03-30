package genericutility;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperty1 
{ 
	  @Test
	  public String  fetchProperty(String key) throws Throwable
	    {
	        FileInputStream path = new  FileInputStream("./Data/shoppers.properties");
	        Properties pobj = new Properties();
	        pobj.load(path);
	        Thread.sleep(3000);
	        String data = pobj.getProperty(key);
	        return data;
	        
	       
	    }
	  
	
	}

