import java.util.Set;

import org.apache.commons.io.output.CloseShieldOutputStream;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.http.Cookie;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.firefoxdriver().setup();
FirefoxDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://play.google.com/store/apps/details?id=com.zerofasting.zero&hl=en_IN&gl=US");
driver.navigate().back();
driver.navigate().forward();
//driver.navigate().refresh();
//System.out.println(driver.manage().getCookies());
//driver.manage().deleteAllCookies();
//System.out.println(driver.manage().getCookies());
driver.navigate().to("https://play.google.com/store/apps/details?id=com.zerofasting.zero&hl=en_IN&gl=US");
WebDriverManager.chromedriver().setup();
ChromeDriver driver1=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://play.google.com/store/apps/details?id=com.zerofasting.zero&hl=en_IN&gl=US");
//driver.navigate().back();
//driver.navigate().forward();
	
	}}
