package learnPOM.pages;
import learnPOM.base.ProjectSpecificMethods;

public class MyHome extends ProjectSpecificMethods {
	
	public MyLeads clickLeads(){
		driver.findElementByLinkText("Leads").click();
		return new MyLeads();
	}
}
