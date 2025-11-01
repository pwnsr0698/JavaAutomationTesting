package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;


public class ButtonPage extends Baselibrary{

	
	public ButtonPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;

	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-toggle=\"collapse\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[@href=\"#tab_5\"]")
private WebElement button;	
	
	@FindBy(xpath="//button[@ondblclick=\"doubletext()\"]")
	private WebElement doubleclick;
	
	@FindBy(xpath="//button[@oncontextmenu=\"righttext()\"]")
	private WebElement rightclickbutton;
	@FindBy(xpath="//button[@onclick=\"clicktext()\"]")
	private WebElement clickbutton;
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
	public void clickonelement()
	{
		waitforClick(element);
	//element.click();	
	}
	
	public void clickonButton()
	{
		waitforClick(button);
	//button.click();	
	}
	public void clickonDoubleClickButton()
	{
		waitforClick(doubleclick);
		//doubleclickonElement(doubleclick);
	}
	public void clickonRightClickButton()
	{
		waitforClick(rightclickbutton);
	//	rightclick(rightclickbutton);
	}
	public void clickonClickButton()
	{
		waitforClick(clickbutton);
		//actionClick(clickbutton);
	}
}
