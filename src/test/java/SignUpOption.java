import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.genericUtils.demoblaze.Base;

public class SignUpOption extends Base {
	
	@Test
	public void signUpOptionTest()
	{
		driver.findElement(By.id("signin2")).click();
	}

}
