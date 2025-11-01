package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import baselibrary.Baselibrary;


	public class ModalDialoguePage extends Baselibrary{

		
		public ModalDialoguePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//button[text()=\"×\"]")
		private WebElement close;

		@FindBy(xpath="//a[@href=\"newdemo.html\"]")
		private WebElement practice;
		
		@FindBy(xpath="//button[@data-target=\"#alerts\"]")
		private WebElement AlertPage;
		
		@FindBy(xpath="//a[@href=\"#tab_15\"]")
		private WebElement ModalDialogue;
		
		@FindBy(xpath="//button[@data-target=\"#exampleModal1\"]")
		private WebElement SmallModalButton;
		@FindBy(xpath="//button[@data-dismiss=\"modal\"]")
		private WebElement SmallCloseButton;
		
		@FindBy(xpath= "//button[@data-target=\"#exampleModal2\"]")
		private WebElement LargeModalButton;
		@FindBy(xpath="//button[@data-dismiss=\"modal\"]")
		private WebElement LargeCloseButton;
		
		public void clickonClose()
		{
			waitforClick(close);
	//close.click();	
		}

		public void clickonpractice()
		{
			waitforClick(practice);
		//practice.click();
		}
		

		public void clickonAlertPage()
		{
			waitforClick(AlertPage);
	//AlertPage.click();
		}
		
		public void clickonModalDialogueButton()
		{
			waitforClick(ModalDialogue);
	//ModalDialogue.click();
		}
		
		public void clickonSmallModalButton()
		{
			waitforClick(SmallModalButton);
	//SmallModalButton.click();
			actionClick(SmallCloseButton);
		}
		
		
		public void clickonLargeModalButton()
		{
			waitforClick(LargeModalButton);
	//LargeModalButton.click();
			actionClick(LargeCloseButton);
		}
		
	}
