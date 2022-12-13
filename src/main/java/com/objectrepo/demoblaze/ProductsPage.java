package com.objectrepo.demoblaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
	
	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement placeOrderButton;
	
	@FindBy(id = "name")
	private WebElement custName;
	
	@FindBy(id = "country")
	private WebElement countryName;
	
	@FindBy(id = "city")
	private WebElement cityName;
	
	@FindBy(id = "month")
	private WebElement monthText;
	
	@FindBy(id = "year")
	private WebElement yearText;
	
	@FindBy(xpath = "//button[text()='Purchase']")
	private WebElement purchaseButton;

	public WebElement getPlaceOrderButton() {
		return placeOrderButton;
	}

	public WebElement getCustName() {
		return custName;
	}

	public WebElement getCountryName() {
		return countryName;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getMonthText() {
		return monthText;
	}

	public WebElement getYearText() {
		return yearText;
	}

	public WebElement getPurchaseButton() {
		return purchaseButton;
	}
	
	

}
