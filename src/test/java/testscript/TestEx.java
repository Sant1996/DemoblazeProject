package testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		String s="Santosh";
		driver.findElement(By.name("q")).sendKeys("Santosh");
	//	Thread.sleep(3000);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@class='wM6W7d']"))));
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		int count = names.size();
		
		int count1=0;
		for(int i=0;i<count;i++)
		{
			
			String text = names.get(i).getText();
			System.out.println(text);
			if(text.contains(s))
			{
				count1++;
			}
			
		}
		System.out.println(count1+" no's matching names");
		driver.close();
		

	}

}
