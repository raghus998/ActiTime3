package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackerPage  extends BasePage
{
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutBt;
	
	@FindBy(xpath="//div[@class='popup_menu_icon support_icon']")
	private WebElement help;
	
	@FindBy(xpath = "//a[.='About your actiTIME']")
	private WebElement aboutyouractitime;
	
	
	@FindBy(xpath = "//span[.='(build 814_24)']")
	private WebElement buildno;
	
	public EnterTimeTrackerPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnLogout()
	{
		logoutBt.click();
	}
	
	public void clickOnHelp()
	{
		help.click();
	}
	
	public void clickOnAboutYourActitime()
	{
		aboutyouractitime.click();
	}
	
	public String verifyBuildNo()
	{
		verifyElement(buildno);
		String actualbuildno = buildno.getText();
		return actualbuildno;
	}
	

}
