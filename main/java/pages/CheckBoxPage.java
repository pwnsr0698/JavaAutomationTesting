package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baselibrary;

public class CheckBoxPage extends Baselibrary {

	public CheckBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;

	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-toggle=\"collapse\"]")
	private WebElement element;
	
	@FindBy(xpath = "//a[@href=\"#tab_2\"]")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@id=\"myCheck\"]")
	private WebElement mobilecheckbox;
	
	@FindBy(xpath="//input[@onclick=\"myFunction1()\"]")
	private WebElement laptopcheckbox;
	
	@FindBy(xpath="//input[@id=\"mydesktop\"]")
	private WebElement desktopcheckbox;
	
	@FindBy(xpath="//iframe[@src=\"Checkbox.html\"]")
	private WebElement iframe;
	
	@FindBy(xpath="//input[@id=\"myCheck\"]")
	private WebElement mobiletext;
	

	@FindBy(xpath="//h6[@id=\"text1\"]")
	private WebElement laptoptext;
	
	@FindBy(xpath="//h6[@id=\"text2\"]")
	private WebElement desktoptext;
	
	public void clickonClose()
	{
	close.click();	
	}

	public void clickonpractice()
	{
		
	practice.click();
	}
	public void clickonelement()
	{
	element.click();	
	}
	
	public void clickoncheckbox()
	{
	checkbox.click();	
	}
	
	public void clickonmobilecheckbox()
	{
		driver.switchTo().frame(iframe);
		String expected = getReadData("mobile");
		mobilecheckbox.click();	
		String actual = mobiletext.getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().defaultContent();
	}
	
	public void clickonlaptopcheckbox()
	{
		driver.switchTo().frame(iframe);
		String expected = getReadData("laptop");
		laptopcheckbox.click();	
		String actual = laptoptext.getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().defaultContent();
	}
	public void clickondesktopcheckbox()
	{
		driver.switchTo().frame(iframe);
		String expected = getReadData("desktop");
		desktopcheckbox.click();	
		String actual = desktoptext.getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().defaultContent();
	}
}
