package dummy_package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DummyTest {
	@Test
	public void addDummy() {
		Reporter.log("Dummy Test is executed", true);
	}

}
