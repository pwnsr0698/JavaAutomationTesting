package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;



	public class HomePage extends BaseLibrary {
		
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
	
  @FindBy(xpath="//span[text()='×']")
    private WebElement close;
    
    
   public void close()
    {
    	//waitforclick(close);
    	//close.click();
    actionClick(close);
    }
    
    public void getTitle()
    {
    	String title = driver.getTitle();
    	System.out.println(title);
    }
	
}
