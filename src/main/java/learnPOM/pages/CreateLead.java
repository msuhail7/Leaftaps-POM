package learnPOM.pages;

import learnPOM.base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
	
	public CreateLead enterCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		return this;		
	}

	public CreateLead enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		return this;		
	}
	
	public CreateLead enterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;		
	}
	
	public ViewLeadPage clickLeadButton() {
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		return new ViewLeadPage();
	}
}