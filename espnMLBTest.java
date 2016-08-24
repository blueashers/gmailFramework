package ESPN.Framework.Tests;

import ESPN.Framework.Setup.espnWebSetup;
import ESPN.Framework.Objects.espnMenuBarActions;

public class espnMLBTest {

	public static void main(String[] args) {
		
		//Test to click the NFL menu on ESPN.com and then click the Stats menu option
		espnWebSetup.setupDriver("chrome", "http://espn.com");
		espnMenuBarActions.clickMLB();
		espnMenuBarActions.clickMLBStats();

	}

}
