package learnPOM.pages;

import learnPOM.base.ProjectSpecificMethods;

public class MyLeads extends ProjectSpecificMethods {
	public CreateLead createLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead();		
	}
}