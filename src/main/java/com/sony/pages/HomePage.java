package com.sony.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//By myAccount=By.linkText("My Account");
	
	WebDriver driver;
	
	@FindBy(linkText="My Account")
	WebElement myAccEle;
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void clickOnMyAccount()
	{
		//WebElement myAccEle = driver.findElement(myAccount);
		myAccEle.click();
	}

}
