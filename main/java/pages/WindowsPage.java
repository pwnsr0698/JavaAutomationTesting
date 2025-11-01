package pages;

	
	import java.util.List;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

	public class WindowsPage extends Baselibrary{

		
		public WindowsPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//button[text()=\"×\"]")
		private WebElement close;

		@FindBy(xpath="//a[@href=\"newdemo.html\"]")
		private WebElement practice;
		
		@FindBy(xpath="//button[@data-target=\"#alerts\"]")
		private WebElement Windows;
		@FindBy(xpath= "//a[@href=\"#tab_11\"]")
		private WebElement browser;
		
		@FindBy(xpath="//a [@href=\"https://www.google.co.in/\"]")
		private WebElement newtab;
		
		
		@FindBy(xpath="//textarea[@name=\"q\"]")
		private WebElement textarea;
		
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
		

		public void clickonwindows()
		{
			//waitforClick(Windows);
	Windows.click();
		}
		

		public void clickonbrowser()
		{
			waitforClick(browser);
	//browser.click();
		}
		

		public void clickonnewtab()
		{
			waitforClick(newtab);
	//newtab.click();
		}
		
		
		public void switchtonexttab()
		{
			switchToWindow(1);
		}
		public void filldetail()
		{
			waitforvisibility(textarea);
			textarea.sendKeys("testingbaba/old");
		}

}
