
	package baselibrary;

	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.Clipboard;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.util.ArrayList;
	import java.util.Properties;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;

import ApplicationUtility.ApplicationUtility;
import excelutility.ExcelUtility;
import popertyutility.PropertyUtility;
import screenshotutility.ScreenshotUtility;

import org.openqa.selenium.support.events.EventFiringWebDriver;

	import waitutility.WaitUtility;



	public class Baselibrary implements ExcelUtility, PropertyUtility, ApplicationUtility, WaitUtility, ScreenshotUtility {
		
		public static WebDriver driver = null;

		public void launchurl(String browserName)
		{
			if(browserName.equals("chrome")){
			String path = "C:\\Users\\Admin\\Desktop\\Hp\\eclipse\\JavaAutomationTesting\\WebDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
					driver = new ChromeDriver();
					
			}
			
			else if (browserName.equalsIgnoreCase("firefox")) {
			    String path = "C:\\Users\\Admin\\Desktop\\Hp\\eclipse\\JavaAutomationTesting\\WebDriver\\geckodriver.exe";
			    System.setProperty("webdriver.gecko.driver", path);
			    driver = new FirefoxDriver();
			}

			else if (browserName.equalsIgnoreCase("edge")) {
			    String path = "C:\\Users\\Admin\\Desktop\\Hp\\eclipse\\JavaAutomationTesting\\WebDriver\\msedgedriver.exe";
			    System.setProperty("webdriver.edge.driver", path);
			    driver = new EdgeDriver();
	}
		
		driver.get("https://testingbaba.com/old");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		}
		@Override
			public String getReadData(String path,int SheetNo, int row, int col) {
				String paths = "C:\\Users\\Admin\\Desktop\\Hp\\eclipse\\JavaAutomationTesting\\TestData\\Book1.xlsx";
				String value="";
				try {
					FileInputStream fis = new FileInputStream(paths);
					XSSFWorkbook wb = new XSSFWorkbook(fis);
					XSSFSheet sheet = wb.getSheetAt(SheetNo);
					value =sheet.getRow(row).getCell(col).getStringCellValue();
					
				} catch (Exception e) {
					System.out.println("Issue in get read data : " + e);
				}
				return value;
				
				
		}

		@Override
			public void getscreenshot(String folderName, String fileName) {
				String loc = System.getProperty("user.dir");
			String path = 	loc + "//screenshot//" + folderName + File.separator + fileName + ".png";
				
				try {
				
			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			File src = efw.getScreenshotAs(OutputType.FILE);
			File des = new File(path);
			FileUtils.copyFile(src, des);

				}
					
				catch(Exception e) {
					System.out.println("Issue in getting screenshot : " + e);
				}}

				@AfterMethod
				public void resultanalysis(ITestResult result) {
					String methodName = result.getMethod().getMethodName();
					if(result.getStatus()==ITestResult.SUCCESS)
					{
						getscreenshot("pass",methodName);
					}
					else if (result.getStatus()==ITestResult.FAILURE)
					{
						getscreenshot("fail", methodName);
					}
					
			}
			
		

		@Override
		public void waitforClick(WebElement ele) {
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
		}

		@Override
			public void waitforvisibility(WebElement ele) {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOf(ele));
			}

		@Override
		public void waitforAlert(WebElement ele) {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
		}

		@Override
		public void actionClick(WebElement ele) {
			Actions act= new Actions(driver);
			act.click(ele).perform();
		}

		@Override
		public void rightclick(WebElement ele) {
			Actions act= new Actions(driver);
			act.contextClick(ele).perform();
			}

		@Override
		public void doubleclickonElement(WebElement ele) {
			Actions act= new Actions(driver);
			act.doubleClick(ele).perform();;
			
			
		}

		@Override
			public void movetoElement(WebElement ele) {
	            Actions act  = new Actions(driver);
	            act.moveToElement(ele).build().perform();
		}

		@Override
		public void switchToWindow(int index) {
			Set<String> Set = driver.getWindowHandles();
			ArrayList<String> handles = new ArrayList<>(Set);
			driver.switchTo().window(handles.get(index));
		}

		@Override
			public void uploadfile(String file) {
				StringSelection sel = new StringSelection(file);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(sel, null);


				try {
					Robot rob = new Robot();
					rob.keyPress(KeyEvent.VK_CONTROL);
					rob.keyPress(KeyEvent.VK_V);
					rob.keyRelease(KeyEvent.VK_CONTROL);
					rob.keyRelease(KeyEvent.VK_CONTROL);
					
					rob.keyPress(KeyEvent.VK_ENTER);
					rob.delay(250);
					rob.keyRelease(KeyEvent.VK_ENTER);
				}
				catch(Exception e) {
				System.out.println("Issue in upload file : " + e);
				{
					
				
				}}

		}

		@Override
		public void selectbytext(WebElement ele, String text) {
			Select sel = new Select(ele);
			sel.selectByVisibleText(text);
				}

		@Override
		public void selectbyIndex(WebElement ele, int Index) {
			Select sel = new Select(ele);
	sel.selectByIndex(Index);
			
		}

		@Override
		public void selectbyvalue(WebElement ele, String text) {
			Select sel = new Select(ele);
	sel.selectByValue(text);	}


		@Override
		public String getReadData(String key) {
			String path = "C:\\Users\\Admin\\Desktop\\Hp\\eclipse\\JavaAutomationTesting\\TestData\\config.properties";
			String value="";
			try {
				FileInputStream fis = new FileInputStream(path);
				Properties prop = new Properties();
			prop.load(fis);
		prop.getProperty(key);
			} catch (Exception e) {
				System.out.println("Issue in get read data : " + e);
			}
			return value;
		}
		
		
		@AfterTest
		public void closebrowser()
		{
		//driver.quit();	
		}
		

	}
		