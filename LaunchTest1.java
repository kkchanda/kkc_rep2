/**
 * 
 */
package kkcpkg;

import org.openqa.selenium.WebDriver;

public class LaunchTest1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver=Kkcclass.getDriver("CRM");
		
		driver.get(("https://www.google.com/"));
		
		//Kkcclass.getDriver("IEEE")
		//driver.get("https://www.timesnow.com);
		
		}
		
		
	}


