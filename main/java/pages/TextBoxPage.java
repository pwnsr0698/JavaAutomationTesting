package pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.Baselibrary;

public class TextBoxPage extends Baselibrary {

	String paths = "C:\\Users\\Hp\\eclipse\\NewAutomationTesting\\TestData\\Book1.xlsx";
	public TextBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"×\"]")
	private WebElement close;

	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-toggle=\"collapse\"]")
	private WebElement element;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div/a[1]")
	private WebElement textbox;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/input[1]")
	private WebElement fullname;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/input[2]")
	private WebElement email;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/textarea[1]")
	private WebElement currentaddress;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/textarea[2]")
	private WebElement permanentaddress;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/input[3]")
	private WebElement submit;
	
	@FindBy(xpath ="//div[@class='col-md-6 mt-5']/label")
	private List<WebElement> list;


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

public void clickontextbox()
{
	textbox.click();
	}

public void filldetails()
{
fullname.sendKeys(getReadData(paths,0,1,0));
email.sendKeys(getReadData(paths,0,1,1));
currentaddress.sendKeys(getReadData(paths,0,1,2));
permanentaddress.sendKeys(getReadData(paths,0,1,3));
submit.click();
}

@SuppressWarnings("deprecation")
public void validate() {
	SoftAssert sassert = new SoftAssert();
    ArrayList<String> actual = new ArrayList<>();
    ArrayList<String> expected = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
        expected.add(getReadData(paths,0, 1, i));
    }
expected.add("testing");
    for (int i = 1; i < list.size(); i = i + 2) {
        actual.add(list.get(i).getText());
    }

    for (int i = 0; i < actual.size(); i++) {
        sassert.assertEquals(actual.get(i), expected.get(i));
    }
    System.out.println("validation succesfull");
    sassert.assertAll();
}
}