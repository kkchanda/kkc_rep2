/**
 * 
 */
package kkcpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Kkcclass {

	public static WebDriver getDriver(String Bname) {
		// TODO Auto-generated method stub
		
		if(Bname.equals("CRM"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if (Bname.equals("IEEE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else
			
			return null;

	}

}
