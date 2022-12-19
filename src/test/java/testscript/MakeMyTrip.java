package testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Hyderbad");
		Thread.sleep(1000);
		List<WebElement> dropDowns = driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
		for(int i=0;i<dropDowns.size();i++)
		{
			String text = dropDowns.get(i).getText();
			System.out.println("text is "+text);
			if(text.contains("Hyderabad"))
			{
				dropDowns.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Mumbai");
		List<WebElement> dropDowns2 = driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
		for(int i=0;i<dropDowns.size();i++)
		{
			String text = dropDowns2.get(i).getText();
			System.out.println("text is "+text);
			if(text.contains("Mumbai"))
			{
				dropDowns2.get(i).click();
				break;
			}
		}
		String month="June 2023";
		String day="19";
		String text = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
         System.out.println(text);
         
        while(!text.equals(month))
        {
        	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
            text = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
        }

        List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='DayPicker-Day'])[1]"));
        for(WebElement e:dates)
        {
        	if(e.getText().trim().equals(day))
       // 	System.out.println(e.getText());
        		e.click();
        		break;
        	
        }
	}

}
