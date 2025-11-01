package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

	public class LinksPage extends Baselibrary {

		public LinksPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//button[text()=\"×\"]")
		private WebElement close;

		@FindBy(xpath="//a[@href=\"newdemo.html\"]")
		private WebElement practice;
		
		@FindBy(xpath="//button[@data-toggle=\"collapse\"]")
		private WebElement element;
		
		@FindBy(xpath="//a[@href=\"#tab_6\"]")
		private WebElement links;	
		@FindBy(xpath="//a[@href=\"index.html\" and @target=\"_blank\"]")
		private WebElement demo;
		
		public void clickonClose()
		{
		//close.click();	
			waitforClick(close);
		}

		public void clickonpractice()
		{
			
		//practice.click();
			waitforClick(practice);
		}
		public void clickonelement()
		{
		//element.click();	
			waitforClick(element);
		}
		public void clickonlinks()
		{
			//links.click();
			waitforClick(links);
		}
		public void clickonDemo()
		{
			//demo.click();
			waitforClick(demo);
		}
		public void clickonCloseonNewTab()
		{
		//close.click();	
			switchToWindow(1);
			waitforClick(close);
			switchToWindow(0);

		}
}
	
	
