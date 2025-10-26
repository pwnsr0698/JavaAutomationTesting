package baselibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import ApplicationUtility.applicationutility;
import WaitUtilty.waitutility;

public class BaseLibrary implements waitutility, applicationutility{
	public static WebDriver driver = null;
	public void LaunchURL()
	{
		driver = new ChromeDriver();
		driver.get("http://www.theloom.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		System.out.println("Browser is sucessfully launching");
	}
	
	@AfterTest
	public void closeBrowser() {
	//driver.quit();
	}
	


	@Override
	public void waitforclick(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}


	@Override
	public void waitforvisibility(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}


	@Override
	public void waitforAlert(WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}


	@Override
	public void movetoElement(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
	}


	@Override
	public void rightclick(WebElement ele) {
		Actions act  = new Actions(driver);
		act.contextClick(ele).perform();
	}


	@Override
	public void actionClick(WebElement ele) {
		Actions act = new Actions(driver);
	act.click(ele).perform();
	}


	@Override
	public void doubleclickonElement(WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele);
	}
}
