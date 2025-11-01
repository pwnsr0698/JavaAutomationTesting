package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class NestedFramePage extends Baselibrary{

	
	public NestedFramePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;

	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement AlertPage;
	
	@FindBy(xpath="//a[@href=\"#tab_14\"]")
	private WebElement NestedFrames;
	
	@FindBy(xpath= "//a[@href=\"text1.html\"]")
	private WebElement Clickherebutton;
	
	@FindBy(xpath="//iframe[@src=\"target1.html\"]")
	private WebElement iframe1;
	
	@FindBy(xpath="//iframe[@src=\"text.html\"]")
	private WebElement iframe2;
	@FindBy(xpath= "//iframe[@src=\"example.html\"]")
	private WebElement iframe3;
	
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
	
	public void clickonNestedFrames()
	{
		waitforClick(NestedFrames);
//NestedFrames.click();
	}
	public void clickonClickherebutton()
	{
	driver.switchTo().frame(iframe1);
	driver.switchTo().frame(iframe2);
	driver.switchTo().frame(iframe3);
		waitforClick(Clickherebutton);
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
	
}
