package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class HomePage extends Baselibrary {
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text( )='×']")
	private WebElement close;



public void clickonClose()
{
close.click();	


}

public void gettitle()
{
String title = driver.getTitle();	
System.out.println(title);
}
}