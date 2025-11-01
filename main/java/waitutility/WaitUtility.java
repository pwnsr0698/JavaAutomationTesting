package waitutility;

import org.openqa.selenium.WebElement;

public interface WaitUtility {

	public void waitforClick(WebElement ele);
	public void waitforvisibility(WebElement ele);
	public void waitforAlert(WebElement ele);
}
