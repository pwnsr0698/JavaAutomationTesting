package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.LinksPage;

	
	public class LinksTest extends Baselibrary {
	LinksPage ob;
		

		@BeforeTest
		@Parameters("browserName")
		public void launchUrl(String browserName)
		{
			launchurl(browserName);  // <- From BaseLibrary
			ob= new LinksPage();
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

		public void clickonlinkstest()
		{
		ob.clickonlinks();;	
		}
		@Test(priority=5)

		public void clickonDemo()
		{
			ob.clickonDemo();
		}
		@Test(priority=6)

		public void clickonCloseNewTab()
		{
		ob.clickonCloseonNewTab();
		}
		
}
