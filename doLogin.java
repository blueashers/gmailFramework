package framework.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.setup.*;

public class doLogin {
	//Set elements name here so we can access them later in the class
	//This allows the names to easily be changed later if needed
	static String gmailSignInID = "gmail-sign-in";
	static String emailID = "Email";
	static String nextButtonID = "next";
	static String passwordID = "Passwd";
	static String signInButtonID = "signIn";
	
	static WebDriver driver = webSetup.returnDriver();	
	
	public static void login() {
		String userName = "<redacted>";
		String password = "<redacted>";
		//Call methods to enter the email, click next, enter password, click sign in
		enterEmail(emailID, userName);
		clickNext(nextButtonID);
		enterPassword(passwordID, password);
		clickSignIn(signInButtonID);		
	}
	
	public static void enterEmail(String emailID, String userName) {
		//This finds the email box based on the emailID declared above 
		//and enters the username that's passed in.
		driver.findElement(By.id(emailID)).sendKeys(userName);
	}
	
	
	public static void enterPassword(String passwordID, String password) {
		//This finds the password box based on the passwordID declared above 
		//and enters the password that's passed in.
		driver.findElement(By.id(passwordID)).sendKeys(password);
	}
	
	public static void clickNext(String nextButtonID) {
		//This finds the Next button based on the nextID given above and clicks it.
		driver.findElement(By.id(nextButtonID)).click();
	}
	
	
	public static void clickSignIn(String signInButtonID) {
		//This finds the Signin button based on the nextID given above and clicks it.
		driver.findElement(By.id(signInButtonID)).click();
	}

}
