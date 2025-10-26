package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class SuitPage extends BaseLibrary {
	
	public SuitPage()
	{
	PageFactory.initElements(driver,this);
	}
	
	 @FindBy(xpath="//a[@title=\"SUIT SETS\" and @href=\"javascript:void(0);\"]")
	    private WebElement suitsets;
	 @FindBy(xpath="//ul[@class=\"level0\"]/li/a[@title=\"ALL SUIT SETS\"]")
	 private WebElement allsuitsets; 
	 @FindBy(xpath="//a[@title=\"FEATURED\"]")
	 private WebElement featured;
	 @FindBy(xpath="//div[contains(@class, 'md_gap-x-4')]")
	 private WebElement searchbutton;
	 
	 @FindBy(xpath="//input[@class=\"searchField-SearchBox-Zm-\"]")
	 private WebElement inputdetails;
	 
	 @FindBy(xpath="//button[text()='Search']")
	 private WebElement search;
	 
	 @FindBy(xpath="//span[text()='×']")
	    private WebElement close;
	    
	    
	   public void close()
	    {
	    	//waitforclick(close);
	    	//close.click();
	    actionClick(close);
	    }
	 public void Suitsets()
	    {
	    	waitforclick(suitsets);
	    	//suitsets.click();
	    }
	 public void  clickonAllSuitsets()
	 {
		 //movetoElement(suitsets);
		 //allsuitsets.click();
		 //waitforclick(allsuitsets);
	 }
	 public void clickonFeatured()
	 {
		 //movetoElement(suitsets);
		 //featured.click();
	 }
	 public void clickonsearchbutton()
	 {
		actionClick(searchbutton);
		 
	 }
	 public void filldetails()
	 {
		 inputdetails.sendKeys("suit");
		actionClick(search);
		 
	 }
	
}


