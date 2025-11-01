package tests;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.HomePage;
import pages.TextBoxPage;

public class TextBoxtest extends Baselibrary

{
	TextBoxPage ob;  // <- Assuming constructor is correct
	
	@BeforeTest
	@Parameters("browserName")
	public void launchUrl(String browserName)
	{
		launchurl(browserName);  // <- From BaseLibrary
		ob= new TextBoxPage();
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
	public void clickontextbox()
	{
		ob.clickontextbox();
		}
	
	@Test(priority=5)

public void filldetails()
{
		ob.filldetails();
}
	@Test(priority=6)
	public void validate()
	{
			ob.validate();
	}


}