package testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.genericUtils.demoblaze.Base;
import com.objectrepo.demoblaze.HomePage;

public class AddToCart extends Base {
	
	@Test
	public void addToCartTest()
	{
		 HomePage hp=PageFactory.initElements(driver, HomePage.class);
		 
	}

}
