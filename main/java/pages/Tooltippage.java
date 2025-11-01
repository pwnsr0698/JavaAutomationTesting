package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Tooltippage extends Baselibrary {

	public Tooltippage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;

	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#widget\"]")
	private WebElement widget;
	@FindBy(xpath="//a[@href=\"#tab_22\"]")
	private WebElement tooltip;
	
	@FindBy(xpath= "//button[@data-toggle=\"tooltip\"]")
	private WebElement hovermetosee;
	
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
	
	public void clickonTooltipbutton()
	{
		waitforClick(tooltip);

	//tooltip.click();	
	}
	public void fetchhovermessage()
	{
		String hovermessage = hovermetosee.getAttribute("title");
		System.out.println(hovermessage);
		
	}
	
	
}
