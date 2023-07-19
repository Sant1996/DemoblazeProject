package testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PantaloonDropDowns {
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.pantaloons.com/");
		List<WebElement> Drops = driver.findElements(By.xpath("//div[@class='menu ']"));
		Actions act=new Actions(driver);
		for(int i=0;i<Drops.size();i++)
		{
			WebElement Element = Drops.get(i);
			System.out.println(Element.getText());
			act.moveToElement(Element);
			List<WebElement> subTitle = driver.findElements(By.xpath("//div[@class='subcategory-title']"));
			for(int j=0;j<subTitle.size();j++)
			{
				System.out.println(subTitle.get(i).getText());
			}
		}
	}

}
