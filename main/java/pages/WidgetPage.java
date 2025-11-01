package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class WidgetPage extends Baselibrary {

	public WidgetPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;

	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#widget\"]")
	private WebElement widget;
	@FindBy(xpath="//a[@href=\"#tab_24\"]")
	private WebElement selectmenubutton;
	@FindBy(xpath="//label[text()=\"Select Value\"]/../select")
	private WebElement selectvalue;
	
	@FindBy(xpath="//label[text()=\"Select One\"]/../select")
	private WebElement selectone;
	
	@FindBy(xpath="//label[text()=\"OLd Styel Select Menu\"]/../div/select")
	private WebElement selectoldstyleselectmenu;
	
	@FindBy(xpath="//label[text()=\"Standard Multi Select\"]/../div/select")
	private WebElement selectmultiselectmenu;
	
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
	
	public void clickonSelectButton()
	{
		waitforClick(selectmenubutton);

	//selectmenubutton.click();	
	}
	
	public void selectfromselectvaluedropdown()
	{
		selectbytext(selectvalue, "Group 1, Option 1");
	}
	
	public void selectfromselectonedropdown()
	{
		selectbytext(selectone, "CSS");
	}
	public void selectoldstyleselectmenudropdown()
	{
		selectbytext(selectoldstyleselectmenu, "PHP");
	}
	public void selectmultiselectmenudropdown()
	{
		selectbytext(selectmultiselectmenu, "PHP");
		selectbytext(selectmultiselectmenu,"HTML");
		selectbytext(selectmultiselectmenu,"CSS");
	}
	
}
