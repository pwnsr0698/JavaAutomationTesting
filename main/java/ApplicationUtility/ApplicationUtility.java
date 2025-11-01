package ApplicationUtility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {

	public void rightclick(WebElement ele);
	public void actionClick(WebElement ele);
	public void doubleclickonElement(WebElement ele);
	public void movetoElement(WebElement ele);
	public void switchToWindow(int index);
	public void uploadfile(String file);
	public void selectbytext(WebElement ele, String text);
	public void selectbyIndex(WebElement ele, int Index);
	public void selectbyvalue(WebElement ele, String text);


}

