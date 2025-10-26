package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.SuitPage;

public class SuitsTest extends BaseLibrary{
	
	SuitPage ob =  null;
	
	@BeforeTest
	public void launchurl()
	{
		LaunchURL();
		ob= new SuitPage();
	}
	
	@Test(priority=1)
	public void clickonclose()
	{
		ob.close();
	}
	
	@Test
	public void clickonsuitsets()
	{
		//ob.Suitsets();
	}
	
	@Test
	public void clickonallsuitssets()
	{
		//ob.clickonAllSuitsets();
	}
	
	@Test
	public void clickonfeatured()
	{
		//ob.clickonFeatured();
	}
	@Test(priority=2)
	public void clickonsearchbutton()
	{
		ob.clickonsearchbutton();
	}
	
	@Test(priority=3)
	public void filldetails()
	{
		ob.filldetails();

	}
	
	
}
