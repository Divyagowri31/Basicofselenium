package Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class Class1 extends Base {
	@FindBy(id = "benzradio")
	public static WebElement benz;
	//benz.

	
	@FindBy(xpath = "//select[@name='cars']")
	public static  WebElement honda;
	

	@FindBy(xpath = "//input[@id='bmwcheck']")
	public  WebElement bmw;		

	/*@FindBy(id = "hondacheck")
	public  WebElement Hondaa;		*/

	
	public  Class1() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	} 
	
	public  void btnClick() {
		Common.clickFunction(benz,"Benz");    
	}
	public void dropSelect() {
	     Common.downSelect(honda,"Honda");
	    
	}
    public void vehicleSelect() {
    	Common.ownVehicle(bmw, "BMW");
    	
    	//Common.ownVehicle(Hondaa, "Hnd");
		

	}
	

}

