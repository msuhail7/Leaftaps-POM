package learnPOM.pages;

import learnPOM.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public void verifyLogin() {
		String text=driver.findElementByTagName("h2").getText();
		if(text.contains("demo"))
			System.out.println("Login Success");
		else
			System.out.println("Login Failed");		
	}
	
	public MyHome clickCrmLink(){
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHome();
	}
	
	public LoginPage logout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}	
}