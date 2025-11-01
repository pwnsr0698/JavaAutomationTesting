package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class WebTablePage extends Baselibrary{

	String paths= "C:\\Users\\Hp\\eclipse\\NewAutomationTesting\\TestData\\Book1.xlsx";
	
	public WebTablePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;

	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-toggle=\"collapse\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[@href=\"#tab_4\"]")
	private WebElement webtable;
	
	@FindBy(xpath="//iframe[@src=\"Webtable.html\"]")
	private WebElement frame;
	@FindBy(xpath="//input[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
	private WebElement name;
	

	@FindBy(xpath="//input[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"]")
	private WebElement email;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement save;
	
	@FindBy(xpath = "//button[text()=\"Edit\"]")
	private List<WebElement> list;
	
@FindBy(xpath="//input[@name=\"edit_name\"]")
private WebElement editname;

@FindBy(xpath="//input[@name=\"edit_email\"]")
private WebElement editemail;
@FindBy(xpath="//button[text()=\"Update\"]")
private WebElement update;
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
	public void clickonWebTable()
	{
	webtable.click();	
	}
	
	public void fillDetails()
	{
		driver.switchTo().frame(frame);
	for(int i=1;i<4;i++)
	{
		name.sendKeys(getReadData(paths,1,i,0));
		email.sendKeys(getReadData(paths,1,i,1));
	    save.click();	
	}
	}	
	public void updatedetails()
	{
		int j=1;
		for(int i=0;i<list.size(); i++)
		{
			list.get(i).click();	
			editname.clear();
			editname.sendKeys(getReadData(paths,2,j,0));
			editemail.clear();
			editemail.sendKeys(getReadData(paths,2,j,1));
			update.click();
			j++;
		}
		driver.switchTo().defaultContent();
		}
}
