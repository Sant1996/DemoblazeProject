import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.genericUtils.demoblaze.Base;
import com.objectrepo.demoblaze.HomePage;
import com.objectrepo.demoblaze.ProductsPage;

public class OrderPlace extends Base {
	
	@Test
	public void placeOrder() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.getCartButton().click();
		Thread.sleep(3000);
		ProductsPage p=PageFactory.initElements(driver, ProductsPage.class);
		p.getPlaceOrderButton().click();
		Thread.sleep(3000);
		System.out.println(fl.getExcelData("Details", 0, 0));
	//	p.getCustName().sendKeys(fl.getExcelData("Details", 0, 0));
//		String name = fl.getExcelData("Details", 0, 0);
//		System.out.println(name);
//		Thread.sleep(3000);
	}

}
