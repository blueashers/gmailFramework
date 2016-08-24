package framework.tests;

import framework.Objects.doLogin;
import framework.setup.webSetup;

public class firstTest {

	public static void main(String[] args) {
			webSetup.setDriver("chrome", "http://gmail.com");
			doLogin.login();
			webSetup.cleanup();
	}

}
