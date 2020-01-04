package learnPOM.pages;

import learnPOM.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	
	public LoginPage enterUserName() {
		driver.findElementById("username").sendKeys("demosalesmanager");
		//driver.findElementById("username").sendKeys(uname);
		return this; //return to the same java class and will redirect to the next method in the same class
	}
	
	public LoginPage enterPassword() {		
		driver.findElementById("password").sendKeys("crmsfa");
		//driver.findElementById("password").sendKeys(pwd);
		return this;
	}
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();		//Constructor for the next page class
	}
}