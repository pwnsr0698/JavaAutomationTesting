package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.ModalDialoguePage;
import pages.NestedFramePage;

	public class ModalDialogueTest extends Baselibrary {
		ModalDialoguePage ob = null;  // <- Assuming constructor is correct
		
		@BeforeTest
		@Parameters("browserName")
		public void launchUrl(String browserName)
		{
			launchurl(browserName);   // <- From BaseLibrary
			ob= new ModalDialoguePage();
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

		public void clickonModalDialogueButton()
		{
			
ob.clickonModalDialogueButton();
		}
		@Test(priority=5)

		public void clickonSmallDialogueButton()
		{
			
ob.clickonSmallModalButton();
		}
		
	
		
		@Test(priority=6)

		public void clickonLargeDialogueButton()
		{
			
ob.clickonLargeModalButton();
		}
		
		
}
