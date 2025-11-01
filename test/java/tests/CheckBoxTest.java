package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.CheckBoxPage;

public class CheckBoxTest extends Baselibrary {

	CheckBoxPage ob;
	

	@BeforeTest
	@Parameters("browserName")
	public void launchUrl(String browserName)
	{
		launchurl(browserName);  // <- From BaseLibrary
		ob= new CheckBoxPage();
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
	public void clickonelement()
	{
ob.clickonelement();
	}
	
	@Test(priority=4)
	public void clickoncheckbox()
	{
		ob.clickoncheckbox();	}
	

@Test(priority=5)
public void clickonmobilecheckbox()
{
	ob.clickonmobilecheckbox();	
}

@Test(priority=6)
public void clickonlaptopcheckbox()
{
	ob.clickonlaptopcheckbox();	
}

@Test(priority=7)
public void clickondesktopcheckbox()
{
	ob.clickondesktopcheckbox();	
}
}