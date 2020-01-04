package learnPOM.pages;

import learnPOM.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{

	public ViewLeadPage verifyName()
	{
		String leadname=driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(leadname);
		if(leadname.equals("Suhail"))
			System.out.println("Lead created Successfully");
		return this;			
	}
}