package Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class Class4 extends Base {
	@FindBy (id="hide-textbox")
	 public static WebElement hideshow;
	
	@FindBy(id="show-textbox")
   private static WebElement showtxt;
	 
	 public Class4() {
			PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		}
	 
	  public void clickCheck() {
			Common.hideBox(hideshow, "hide thge method");

		}
}
