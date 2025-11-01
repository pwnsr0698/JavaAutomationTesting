package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.AlertPage;

	
	public class AlertTest extends Baselibrary {
		AlertPage ob = null;  // <- Assuming constructor is correct
		@BeforeTest
		@Parameters("browserName")
		public void launchUrl(String browserName)
		{
			launchurl(browserName);   // <- From BaseLibrary
			ob= new AlertPage();
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

		public void clickonAlertButton()
		{		
ob.clickonAlertButton();
		}
		@Test(priority=5)

		public void clickonAlertClickButton()
		{	
ob.clickonAlertClickButton();
		}
		@Test(priority=6)

		public void clickonClickWaitAlert()
		{	ob.clickonClickWaitAlert();
			
		}
		@Test(priority=7)

		public void clickonClickConfirmAlert()
		{	ob.clickonClickConfirmAlert();
			
		}
		@Test(priority=8)

		public void clickonClickPromptAlert()
		{	ob.clickonClickPromptAlert();
			
		}
}
