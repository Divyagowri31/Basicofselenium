package Project;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class Class2 extends Base {

	@FindBy(id="openwindow")
	  public static WebElement openwindow;

	
public Class2() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

public void windowOPen() {
	Common.windowClk(openwindow, "Open the window");
	String handling=driver.getWindowHandle();
	driver.switchTo().window(handling);
}
}

