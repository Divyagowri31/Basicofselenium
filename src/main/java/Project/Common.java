package Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Common extends Base {
	public static void clickFunction(WebElement element,String name) {
		   element.click();
		   System.out.println(name+" clicked ");
}
public static void downSelect(WebElement element, String dropdwn) {
	   Select select = new Select(element);
	   select.selectByVisibleText(dropdwn);
}

public static void ownVehicle(WebElement element,String send) {
	  element.click();
	  System.out.println(send+"Option is selected");

}

public static void windowClk(WebElement window,String open) {
	   window.click();
	System.out.println("window opening");
}

public static void btnEnable(WebElement element, String username) {
	   element.click();
	  if(element.isDisplayed()){
		 element.sendKeys(username);
		 }
	  else
	  {
	System.out.println("Disable button");
	  }
	  
	  }

public static void hideBox(WebElement element,String click) {
	
element.click();
System.out.println("Hiding the button");
		}

public static void certSelect(WebElement element , String drp )  {
element.click();
//driver.switchTo().window("demourl");
//driver.switchTo().frame(0);
System.out.println("Click the course");
	}

public static void sendKey(WebElement element, String value) {
	// TODO Auto-generated method stub
element.sendKeys(value);
}
}
