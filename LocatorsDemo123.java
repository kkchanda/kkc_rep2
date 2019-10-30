package kkcpkg;
//
//import java.awt.Dimension;
//import java.awt.List;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsDemo123 {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver;
			driver = Kkcclass.getDriver("CRM");
//			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get("http://www.newtours.demoaut.com/");
//			WebDriverWait wait1 = new WebDriverWait(driver, 60);
//			wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
			driver.manage().window().maximize();  //full screen
			Thread.sleep(3000);
//			Dimension d = new Dimension(300,500); //define your desired size x,y
//			driver.manage().window().setSize(d);
//			Thread.sleep(3000);
//			Point p = new  Point(200,300); //to change the origin to a desired point x, y
//			driver.manage().window().setPosition(p);
//			Thread.sleep(3000);
//			driver.close();
			
//			WebElement Uname = driver.findElement(By.name("userName"));
//			Uname.sendKeys("demo");
//			// alternative to above two statements we can write as below
//			// driver.findElement(By.name("userName")).sendKeys("demo");
//			WebElement Pswrd = driver.findElement(By.name("password"));
//			Pswrd.sendKeys("demo");
//			WebElement Sbmt = driver.findElement(By.name("login"));
//			Sbmt.click();
//			String E_Title = "dfsfds  ";
//			String A_Title = driver.getTitle();
//			if(A_Title.equals(E_Title))
//			{
//					System.out.println("login success");
//			}
//			else
//			{
//					System.out.println("login failure");
//			}
// WebElement Uname = driver.findElement(By.name("userName")
//						
//			List<WebElement> T_link =driver.findElements(By.tagName("a"));
//			int Tn_links = T_link.size();
//			System.out.println("the total no links in the page are " + Tn_links);
//			for (int i=0; i<Tn_links;i++)
//			{
//					String Ltext = T_link.get(i).getText();
//					System.out.println(Ltext);
//			}
			driver.findElement(By.linkText("REGISTER")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Kushal Kumar");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Chanda");
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9908522498");
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("kushal.kumar.chanda@accenture.com");
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Divyashree Orion");
			driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Raidurgam");
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Hyderabad");
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Telangana");
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("500032");
			
			Select sel1 = new Select(driver.findElement(By.name("country")));
			sel1.selectByVisibleText("TOGO");
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kushal.kumar.chanda@accenture.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hyderabad");
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Hyderabad");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@name='register' and @type='image']")).click();
			
			Thread.sleep(3000);
			
		}
}
