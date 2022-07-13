package Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class Class5 extends Base {
	@FindBy(xpath="//h4[contains(text(),'JavaScript for beginners')]")
	public static WebElement selectcourse;
	
	
	
	public Class5() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	
	
public static void checkCourse(){
		
	
		driver.switchTo().frame(0);
		
		Common.certSelect(selectcourse, "Selecting Cource");
	}
}
