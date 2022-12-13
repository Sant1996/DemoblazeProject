package testscript;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Claender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		driver.findElement(By.xpath("//span[text()='RETURN']")).click();
		String month="June 2023";
		int day=16;
		//div[contains(text(),'January')]/parent::div/following-sibling::div/descendant::p[text()='16']
		//div[contains(text(),'"+month+"')]/ancestor::div[@class='DayPicker-Month']/descendant::div[@class='DayPicker-Day'])["+day+"]
		//driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'March')]")).getText();
		System.out.println(driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText());
		while(true)
		{
			String text=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText();
			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'June')]/parent::div/following-sibling::div/descendant::p[text()='16']")).click();
	}

}
