package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import baselibrary.Baselibrary;
import pages.WindowsPage;

	
	public class WindowsTest extends Baselibrary {
		WindowsPage ob = null;  // <- Assuming constructor is correct
		@BeforeTest
		@Parameters("browserName")
		public void launchUrl(String browserName)
		{
			launchurl(browserName);  // <- From BaseLibrary
			ob= new WindowsPage();
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

		public void clickonWindows()
		{
			
	ob.clickonwindows();
		}	
		@Test(priority=4)
		public void clickonbrowser()
		{
			
	ob.clickonbrowser();
		}	
		
		@Test(priority=5)
		public void clickonnewtab()
		{
		ob.clickonnewtab();
		}	
		@Test(priority=6)
		public void switchtonexttab()
		{
			ob.switchtonexttab();
		}	
		
		@Test(priority=6)
		public void filldetail()
		{
			ob.filldetail();
		}	
		



}
