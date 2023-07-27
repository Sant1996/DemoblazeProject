package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver1=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Chrmedriver launched");
		System.out.println("Google website open");
		
	}

}
