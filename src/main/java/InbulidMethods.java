import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InbulidMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://zero.webappsecurity.com/");
driver.findElement(By.id("signin_button")).click();
driver.findElement(By.id("user_login")).sendKeys("Gowri");
Boolean Display=driver.findElement(By.id("user_login")).isDisplayed();
System.out.println("Name displayed or not :" + Display);
driver.findElement(By.id("user_password")).sendKeys("9791094678");
WebElement Checkbox=driver.findElement(By.id("user_remember_me"));
Checkbox.click();
Boolean Select=driver.findElement(By.id("user_remember_me")).isSelected();
System.out.println("Submit check box selected or not :" +  Select);
driver.findElement(By.name("submit")).click();
driver.navigate().back();
driver.navigate().back();
String signin=driver.findElement(By.id("signin_button")).getText();
System.out.println("Signin text name : " + signin);
driver.navigate().forward();
driver.navigate().forward();
Boolean Enable=driver.findElement(By.name("submit")).isEnabled();
System.out.print("Signin Enabled or not :" +Enable);
String text = driver.findElement(By.xpath("//label[text()='Password']")).getText();
System.out.println("Text  :" + text);
String text2 =driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).getText();
System.out.println(text2);
	}

}
