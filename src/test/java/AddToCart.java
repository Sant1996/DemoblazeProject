import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.genericUtils.demoblaze.Base;
import com.genericUtils.demoblaze.EventList;
import com.objectrepo.demoblaze.HomePage;


@Listeners(EventList.class)
public class AddToCart extends Base
{
	@Test
	public void addCart() throws InterruptedException, IOException
	{
		test=report.createTest("Validate product added to cart");
		test.pass("Logged into the app as :"+fl.getPropetyData("username"));
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		test.pass("Landed on Homepage");
		String pn = hp.getNexus6().getText();
		hp.getNexus6().click();
		test.pass("Click on nexus6 product");
		test.pass("Navigating to Products page :");
		hp.getAddToCart().click();
		cu.waitTillAlertToBeDisplay(driver);
		cu.acceptAlert(driver);
		hp.getCartButton().click();
		Assert.assertTrue(cu.verifyProductInCart(pn, driver).isDisplayed());
	//	Assert.assertTrue(false);
	}
}
