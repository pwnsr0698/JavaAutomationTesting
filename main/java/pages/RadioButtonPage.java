package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baselibrary;

public class RadioButtonPage extends Baselibrary {

	public RadioButtonPage()
	{
		PageFactory.initElements(driver, this);	
}

@FindBy(xpath="//button[text()=\"×\"]")
private WebElement close;

@FindBy(xpath="//a[@href=\"newdemo.html\"]")
private WebElement practice;

@FindBy(xpath="//button[@data-toggle=\"collapse\"]")
private WebElement element;

@FindBy(xpath="//a[@href=\"#tab_3\"]")
private WebElement radiobutton;

@FindBy(xpath = "//input[@onclick=\"like()\"]")
private WebElement yestext;
@FindBy(xpath="//input[@value=\"impressive\"]")
private WebElement impressivetext;

@FindBy(xpath="//input[@value=\"no\"]")
private WebElement notext;

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

public void clickonradiobutton()
{
	waitforClick(radiobutton);
	//radiobutton.click();
	}
public void clickonyestext()
{
	waitforClick(yestext);
	String expected = getReadData("yes");
	String actual= yestext.getText();
	Assert.assertEquals(expected, actual);
}

public void clickonimpressivetext()
{
	waitforClick(impressivetext);
	String expected = getReadData("impressive");
	String actual= impressivetext.getText();
	Assert.assertEquals(expected, actual);
}

public void clickonnotext()
{
	waitforClick(notext);
	String expected = getReadData("no");
	String actual= notext.getText();
	Assert.assertEquals(expected, actual);
}
}



