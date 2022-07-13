package Project;

import org.openqa.selenium.WebDriver;


	public class Base {
		
		protected static WebDriver driver=null;//WebDriver Class
		protected static String url ="https://courses.letskodeit.com/practice";//why passing string 
		protected static String browser = "chrome";
			//int c=20;
		
		/*public Base() {
			PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		}*/
	}

