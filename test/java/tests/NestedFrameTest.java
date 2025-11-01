package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.NestedFramePage;

	public class NestedFrameTest extends Baselibrary {
		NestedFramePage ob = null;  // <- Assuming constructor is correct
		@BeforeTest
		@Parameters("browserName")
		public void launchUrl(String browserName)
		{
			launchurl(browserName);   // <- From BaseLibrary
			ob= new NestedFramePage();
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

		public void clickonAlertPage()
		{
			
ob.clickonAlertPage();
		}
		
		@Test(priority=4)

		public void clickonNestedFrames()
		{
			
ob.clickonNestedFrames();
		}
		
		@Test(priority=5)

		public void clickonClickherebutton()
		{
			
ob.clickonClickherebutton();
		}

}
