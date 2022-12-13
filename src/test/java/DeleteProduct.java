import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericUtils.demoblaze.Base;
import com.objectrepo.demoblaze.HomePage;

public class DeleteProduct extends Base {
	
	@Test
	public void deleteProductTest() throws InterruptedException{
		{
		    HomePage hp=PageFactory.initElements(driver, HomePage.class);
		    hp.getCartButton().click();
		    String pn = hp.getNexus6().getText();
		    cu.deleteProduct(driver, pn).click();
		    Thread.sleep(2000);
		//    driver.findElement(By.xpath("//td[text()='Nexus 6']/following-sibling::td/a")).click();
		    try {
				cu.verifyProductInCart(pn, driver);
				Assert.assertTrue(false, "Product has not been deleted - Test failed ");
			} catch (NoSuchElementException e) {
				// TODO: handle exception
				Reporter.log("Deleted"+pn+"from cart");
			}
		}
	}

}
