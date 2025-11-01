package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.MenuPage;
import pages.Tooltippage;

public class Tooltiptest extends Baselibrary {
	Tooltippage ob = null;  // <- Assuming constructor is correct
	@BeforeTest
	@Parameters("browserName")
	public void launchUrl(String browserName)
	{
		launchurl(browserName);   // <- From BaseLibrary
		ob= new Tooltippage();
	}
	
	@Test(priority=1)
	public void clickonclose()
	{
ob.clickonClose();
	}

	@Test(priority=2)

public void clickonpractice()
{
	
ob.clickonpractice();}
	
	
	@Test(priority=3)

	public void clickonwidget()
	{
ob.clickonwidget();	}
	

	@Test(priority=4)

	public void clickontooltipbutton()
	{ob.clickonTooltipbutton();}
	
	@Test(priority=5)

	public void fetchhovermessage()
	{
ob.fetchhovermessage();	}
	
	


}
