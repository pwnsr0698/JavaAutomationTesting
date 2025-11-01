package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.RadioButtonPage;

public class RadioButtonTest extends Baselibrary{
RadioButtonPage ob;

@BeforeTest
@Parameters("browserName")
public void launchUrl(String browserName)
{
	launchurl(browserName);   // <- From BaseLibrary
	ob= new RadioButtonPage();
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

public void clickonradiobutton()
{
	ob.clickonradiobutton();
	
}

@Test(priority=5)

public void clickonyestext()
{
	ob.clickonyestext();
	
}

@Test(priority=6)

public void clickonimpressivetext()
{
	ob.clickonimpressivetext();;
	
}


@Test(priority=7)

public void clickonnotext()
{
	ob.clickonnotext();
}
	

}

