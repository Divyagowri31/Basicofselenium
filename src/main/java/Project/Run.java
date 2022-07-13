package Project;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class Run extends Base {

		@BeforeTest
		public void openbrowser() {
			
			new Browser().setURL(browser, url);
		}
		
		@Test(priority = 1)
		public void radio() {
			
			new Class1().btnClick();
			System.out.println("Radio Button Selected");
			
			new Class1().dropSelect();
			
			//Select sel = new Select(Search.honda);
			//sel.selectByIndex(2);
			System.out.println("Dropdown selected");
			
			new Class1().vehicleSelect();
			
			System.out.println("Checkbox selected");
		}
		
		@Test(priority = 2)
		public void OpnWin() {
			// TODO Auto-generated method stub
			//String parent = driver.getWindowHandle();
			new Class2().windowOPen();

			
			System.out.println("Window handling completed");
			System.out.println("Title: "+driver.getTitle());
		}
		@Test(priority = 3)
			public void nameEnter() {
				
				new Class3().btnCheck();
				System.out.println("Entered the name Gowri");
				
			}
		@Test(priority= 4)
			public void hideShow() {
				// TODO Auto-generated method stub
				new Class4().clickCheck();
				System.out.println("Hide button clicked");
				
			}
		
			@Test(priority = 5)
			public void corSel()  
			{
				// TODO Auto-generated method stub
				new Class5();
				Class5.checkCourse();
			}
			
				@AfterTest
		public void close_Browser() {
		// TODO Auto-generated method stub
		driver.quit();
		
		}}

