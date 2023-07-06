package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.Baseclass;

public class Singin extends Baseclass {
	 public Singin() {
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath ="//a[text()='Create new account']") 
	private WebElement createnewaccount;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstnametxtbox;
	
	@FindBy(name = "lastname")
	private WebElement secondnamebox;
	
	@FindBy(name = "reg_email__")
	private WebElement mobileoremail;
	
	@FindBy(name = "reg_passwd__")
	private WebElement password;

	public WebElement getCreatenewaccount() {
		return createnewaccount;
	}

	public WebElement getFirstnametxtbox() {
		return firstnametxtbox;
	}

	public WebElement getSecondnamebox() {
		return secondnamebox;
	}

	public WebElement getMobileoremail() {
		return mobileoremail;
	}

	public WebElement getPassword() {
		return password;
	}
}
