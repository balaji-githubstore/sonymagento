package com.sony.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	/*static By email=By.id("email");
	static By pass=By.name("login[password]");
	static By login=By.id("send2");*/
	
	@FindBy(id="email")
	WebElement emailEle ;
	
	@FindBy(name="login[password]")
	WebElement PassEle;
	
	@FindBy(id="send2")
	WebElement loginEle;
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName( String name)
	{
		//WebElement emailEle = driver.findElement(email);
		emailEle.sendKeys(name);
	}
	public void sendPassword( String password)
	{
		//WebElement PassEle = driver.findElement(pass);
		PassEle.sendKeys(password);
	}
	public void clickOnLogin()
	{
		//WebElement loginEle = driver.findElement(login);
		loginEle.click();
	}

}
