import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtils.demoblaze.Base;
import com.genericUtils.demoblaze.EventList;
import com.objectrepo.demoblaze.HomePage;


@Listeners(EventList.class)
public class ContactsDemoblaze extends Base {
	
	@Test(dataProvider = "contactTest")
	public void contactDemoblazeTest(String email,String name) throws IOException, InterruptedException
	{
		 test=report.createTest("Contact Demoblaze");
		 test.pass("Logged into te app as "+fl.getPropetyData("username"));
		 HomePage hp=PageFactory.initElements(driver, HomePage.class);
		 test.pass("Landed on Homepage");
		 cu.resolveStaleElement(hp.getContactButton());
		 Thread.sleep(1000);
		 test.pass("Navigated to Contact module");
		 hp.getEmailTextBox().sendKeys(email);
		 test.pass("Contact email has been entered");
		 hp.getContactNameText().sendKeys(name);
		 test.pass("Contact name has been entered");
		 hp.getSendMsgButton().click();
		 cu.acceptAlert(driver);
		// Assert.assertTrue(false);
		 test.pass("Handled the alert ");
	}
}
