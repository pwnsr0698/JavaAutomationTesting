package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baselibrary;

public class AlertPage extends Baselibrary{

	
	public AlertPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;

	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement AlertPage;
	
	@FindBy(xpath="//a[@href=\"#tab_12\"]")
	private WebElement AlertButton;
	
	@FindBy(xpath="//button[@onclick=\"myalert()\"]")
	private WebElement AlertClickButton;
	@FindBy(xpath= "//button[@onclick=\"aftersec5()\"]")
	private WebElement ClickWaitAlert;
	
	@FindBy(xpath="//button[@onclick=\"myconfirm()\"]")	
	private WebElement ClickConfirmAlert;
	
	@FindBy(xpath="//button[@onclick=\"myprompt()\"]")
	private WebElement ClickPromptAlert;
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
	

	public void clickonAlertPage()
	{
		waitforClick(AlertPage);
//AlertPage.click();
	}
	
	public void clickonAlertButton()
	{
		waitforClick(AlertButton);
		//AlertButton.click();
	}
	
	public void clickonAlertClickButton()
	{
		waitforClick(AlertClickButton);
		//AlertClickButton.click()
		driver.switchTo().alert().accept();
	}
	public void clickonClickWaitAlert()
	{
		waitforClick(ClickWaitAlert);
		//ClickWaitAlert.click();
	waitforAlert(ClickWaitAlert);
	driver.switchTo().alert().accept();
	}
	public void clickonClickConfirmAlert()
	{
		waitforClick(ClickConfirmAlert);
		//ClickConfirmAlert.click()
		driver.switchTo().alert().dismiss();
		//String expected = getReadData("Cancel");
		//String actual= dismiss.getText();
		//Assert.assertEquals(expected, actual);
	}
	
	public void clickonClickPromptAlert()
	{
		waitforClick(ClickPromptAlert);
		//ClickPromptAlert.click()
	driver.switchTo().alert().sendKeys("Pawan");
	driver.switchTo().alert().accept();
	}

	}

	
	

