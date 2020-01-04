package learnPOM.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import learnPOM.base.ProjectSpecificMethods;
import learnPOM.pages.LoginPage;

public class TC01_LoginLogout  extends ProjectSpecificMethods {

	@BeforeTest
	public void setData() {
		xlfilename="leaddata.xlsx";
	}
	
	@Test(dataProvider="getData") 
	public void tc001_CreateLead(String cName, String fName, String lName)
	{
		//LoginPage obj = new LoginPage();
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCrmLink()
		.clickLeads()
		.createLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickLeadButton()
		.verifyName();		
	}
}