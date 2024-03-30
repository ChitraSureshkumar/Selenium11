package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void demo() {
		Reporter.log("Hello", true);
	}
}
