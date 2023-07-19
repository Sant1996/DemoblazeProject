package testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Yaatraa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).sendKeys("Delhi");
		Thread.sleep(2000);
		List<WebElement> sugg = driver.findElements(By.xpath("//p[@class='ac_cityname']"));
		
		String s="Delhi";
		for(int i=0;i<sugg.size();i++)
		{
			String text = sugg.get(i).getText();
			if(text.contains(s))
			{
				sugg.get(i).click();
				break;
			}
		}
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']")).sendKeys("Mysore");
		Thread.sleep(2000);
		List<WebElement> sugg1 = driver.findElements(By.xpath("//p[@class='ac_cityname']"));
		String s2="Mysore";
		for(int i=0;i<sugg1.size();i++)
		{
			String text1 = sugg1.get(i).getText();
			if(text1.contains(s2))
			{
				sugg1.get(i).click();
				break;
			}
		}
		String date="08/06/2023";
		String month="August";
		driver.findElement(By.xpath("//input[@name='flight_origin_date' and @id='BE_flight_origin_date']")).click();
		
	//1st	driver.findElement(By.xpath("(//table[@class='days-head day-container-table'])[2]/tbody/tr/td[3]")).click();
	//2nd	driver.findElement(By.xpath("//table[@class='days-head']/ancestor::div[@class='body-right BE_flight_origin_date']/descendant::td[@data-date='01/02/2023']")).click();
		    driver.findElement(By.xpath("//div[contains(text(),'Mar') and @class='month-title']/following-sibling::div/descendant::td[@id='08/03v/2023']")).click();
		
	//	Thread.sleep(4000);
	//	driver.close();
		    
    
	}

}
