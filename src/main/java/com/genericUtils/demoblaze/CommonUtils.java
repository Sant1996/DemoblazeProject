package com.genericUtils.demoblaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	
	public void resolveStaleElement(WebElement w)
	{
		for(int i=0;i<4;i++)
		try {
			w.getText();
			w.click();
			break;
		} catch (StaleElementReferenceException e2) 
		{
			continue;
		}
	}
	
	public void waitForElementToBePresent(WebDriver driver, WebElement el)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(el));
	}
	
	public void waitTillAlertToBeDisplay(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}

	public WebElement verifyProductInCart(String pn,WebDriver driver)
	{
		return driver.findElement(By.xpath("//td[text()='"+pn+"']"));
	}
	
	public WebElement deleteProduct(WebDriver driver,String pn)
	{
		return driver.findElement(By.xpath("//td[text()='"+pn+"']/following-sibling::td/a"));
	}
		
}
