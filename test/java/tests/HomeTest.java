package tests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.HomePage;

public class HomeTest extends Baselibrary {
	HomePage ob = null;  // <- Assuming constructor is correct
	@BeforeTest
	@Parameters("browserName")
	public void launchUrl(String browserName)
	{
		launchurl(browserName);   // <- From BaseLibrary
		ob= new HomePage();
	}
	
	@Test
	public void clickonclose()
	{
		ob.clickonClose();             // <- Assuming method exists
	}
	@Test
	public void getthetittleofthePage()
	{
		ob.gettitle();
	}
	
	

}