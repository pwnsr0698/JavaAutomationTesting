package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class MenuPage extends Baselibrary{
	public MenuPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;

	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#widget\"]")
	private WebElement widget;
	@FindBy(xpath="//a[@href=\"#tab_23\"]")
	private WebElement menupage;
	
	@FindBy(xpath="//nav[@id=\"navbar\"]/ul/li[3][normalize-space(text())='Services']")
	private WebElement services;
	
	@FindBy(xpath="//a[text()='Web Development']")
private WebElement webdevelopment;	
	//@FindBy(xpath="//nav[@id='navbar']/ul/li[3]/ul/li[normalize-space()='Website Design']")
	//private WebElement options;
	
	
	public void clickonClose()
	{
		waitforClick(close);
	//close.click();	
	}

	public void clickonpractice()
	{
		waitforClick(practice);
	//practice.click();
	}
	public void clickonwidget()
	{
		waitforClick(widget);

	//widget.click();	
	}
	
	public void clickonMenuButton()
	{
		waitforClick(menupage);

	//menupage.click();	
	}
	public void clickonWebDevelopment()
	{
		movetoElement(services);
		webdevelopment.click();
		}
	
	
	
	
	
}
