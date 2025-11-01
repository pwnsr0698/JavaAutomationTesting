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
	
	@Test
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
	@Test
	public void clickonsearchbutton()
	{
		ob.clickonsearchbutton();
	}
	
	@Test
	public void filldetails()
	{
		//ob.filldetails();

	}
	
	@Test
	public void clickonCart()
	{
		ob.clickonCart();
	}
	
}
