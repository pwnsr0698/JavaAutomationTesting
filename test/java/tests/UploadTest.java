package tests;


	
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.ButtonPage;
	import pages.LinksPage;
import pages.UploadPage;

		


		public class UploadTest extends Baselibrary {
		UploadPage ob;
			

			@BeforeTest
			@Parameters("browserName")
			public void launchUrl(String browserName)
			{
				launchurl(browserName);   // <- From BaseLibrary
				ob= new UploadPage();
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

			public void clickonupload()
			{
		      ob.clickonupload();
			}
			
			@Test(priority=5)

			public void clickonchoosebutton()
			{
			ob.clickonchoosebutton();
			}
			
			@Test(priority=6)

			public void uploadfile()
			{
			ob.uploadfile();
			}
			



			
			
			
			
			
}
