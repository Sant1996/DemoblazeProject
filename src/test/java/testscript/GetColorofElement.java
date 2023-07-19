package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetColorofElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		String titlecolor = driver.findElement(By.xpath("//span[.='Download the Meesho App']")).getCssValue("color");
		String backgroundcolor = driver.findElement(By.xpath("//span[.='Download the Meesho App']")).getCssValue("background-color");
		System.out.println(titlecolor);
		System.out.println(backgroundcolor);
	}

}
