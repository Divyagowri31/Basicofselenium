package Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class Class3 extends Base{

	@FindBy(id="enabled-button")
    private  WebElement enablebutton;
	
	@FindBy(id="enabled-example-input")
	private WebElement entername;
	
	 
	 public Class3() {
			PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		}
	 
	 public void btnCheck() {
			Common.btnEnable(entername,"Gowri");

		}

	
}

