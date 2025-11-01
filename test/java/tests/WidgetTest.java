package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.WidgetPage;

public class WidgetTest extends Baselibrary {

	
	WidgetPage ob = null;  // <- Assuming constructor is correct
	@BeforeTest
	@Parameters("browserName")
	public void launchUrl(String browserName)
	{
		launchurl(browserName);  // <- From BaseLibrary
		ob= new WidgetPage();
	}
	
	@Test(priority=1)
	public void clickonclose()
	{
		ob.clickonClose();  
}
	@Test(priority=2)

public void clickonpractice()
{
	
ob.clickonpractice();
}
	
	
	@Test(priority=3)

	public void clickonwidget()
	{
	ob.clickonwidget();	
	}
	
	@Test(priority=4)
	public void clickonSelectButton()
	{
		ob.clickonSelectButton();
		
	}
	
	@Test(priority=5)
	public void clickonselectfromselectvaluedropdown()
	{
		
		ob.selectfromselectvaluedropdown();
		
	}
	
	@Test(priority=6)
	public void clickonselectfromselectonedropdown()
	{
		
	ob.selectfromselectonedropdown();
		
	}
	@Test(priority=7)
	public void clickonselectoldstyleselectmenudropdown()
	{
		
	ob.selectoldstyleselectmenudropdown();
		
	}
	
	@Test(priority=8)
	public void clickonselectmultiselectmenudropdown()
	{
		
	ob.selectmultiselectmenudropdown();
		
	}
	
	
}