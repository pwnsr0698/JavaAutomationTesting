package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.HomePage;

public class LaunchTest extends BaseLibrary {
		HomePage ob = null;  // <- Assuming constructor is correct
		@BeforeTest
		public void launchUrl()
		{
			LaunchURL();  // <- From BaseLibrary
			ob= new HomePage();
		}
		@Test
		public void clickonclose()
		{
			ob.close();
		}
		
		@Test
		public void gettitle()
		{
			ob.getTitle();
		
		}
		
		
		
	}
		

