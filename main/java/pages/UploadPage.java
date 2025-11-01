package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;



public class UploadPage extends Baselibrary {
	String path = "C:\\Users\\Admin\\Desktop\\Hp\\eclipse\\JavaAutomationTesting\\TestData\\Book3.xlsx";

	public UploadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;

	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-toggle=\"collapse\"]")
	private WebElement element;
	
	@FindBy(xpath = "//a[@href=\"#tab_8\"]")
	private WebElement upload;
	@FindBy(xpath="//input[@class=\"form-control-file\"]")
	private WebElement choosebutton;
	
	
	

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

public void clickonupload()
{
	waitforClick(upload);

//upload.click();	
}
	
public void clickonchoosebutton()
{
	//waitforClick(choosebutton);
	actionClick(choosebutton);

//choosebutton.click();	
}
	
	
public void uploadfile()
{
uploadfile(path);

//choosebutton.click();	
}	
	
}
	