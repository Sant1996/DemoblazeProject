package com.objectrepo.demoblaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtils.demoblaze.Base;

public class HomePage {
	
//	public HomePage()
//	{
//		PageFactory.initElements(Base.driver, this);
//	}
	
	@FindBy(xpath = "//a[text()='Log in']")  
	private WebElement login;
	
	@FindBy(id = "loginusername")
	private WebElement userNameTxt;
	
	@FindBy(id = "loginpassword")
	private WebElement pwdTxt;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginButton;
	
	@FindBy(id = "nameofuser")
	private WebElement nameOfUserText;
	
	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement logOutButton;
	
	@FindBy(xpath = "//a[text()='Nexus 6']")
	private WebElement Nexus6;
	
	@FindBy(linkText = "Add to cart")
	private WebElement addToCart;
	
	@FindBy(xpath = "//a[text()='Cart']")
	private WebElement cartButton;
	
	@FindBy(xpath = "//a[text()='Contact']")
	private WebElement contactButton;
	
	@FindBy(id = "recipient-email")
	private WebElement emailTextBox;
	
	@FindBy(id = "recipient-name")
	private WebElement contactNameText;
	
	@FindBy(xpath = "//button[text()='Send message']")
	private WebElement sendMsgButton;
	
	public WebElement getSendMsgButton() {
		return sendMsgButton;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getContactNameText() {
		return contactNameText;
	}

	public WebElement getContactButton() {
		return contactButton;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	public void setCartButton(WebElement cartButton) {
		this.cartButton = cartButton;
	}

	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public void setAddCart(WebElement addCart) {
		this.addToCart = addCart;
	}

	public WebElement getNexus6() {
		return Nexus6;
	}

	public void setNexus6(WebElement nexus6) {
		Nexus6 = nexus6;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getUserNameTxt() {
		return userNameTxt;
	}

	public WebElement getPwdTxt() {
		return pwdTxt;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getNameOfUserText() {
		return nameOfUserText;
	}
	
	

	public WebElement getLogOutButton() {
		return logOutButton;
	}


	public void setLogOutButton(WebElement logOutButton) {
		this.logOutButton = logOutButton;
	}


	public void setLogin(WebElement login) {
		this.login = login;
	}

	public void setUserNameTxt(WebElement userNameTxt) {
		this.userNameTxt = userNameTxt;
	}

	public void setPwdTxt(WebElement pwdTxt) {
		this.pwdTxt = pwdTxt;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public void setNameOfUserText(WebElement nameOfUserText) {
		this.nameOfUserText = nameOfUserText;
	}

    
}
