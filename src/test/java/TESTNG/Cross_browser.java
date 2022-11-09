package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_browser 

{
	WebDriver driver;
	

	@BeforeSuite
	@Parameters("bname")
	public void openbroser(String Browser)
	{
		System.out.println("open browser");
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Automation Jars and drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Downloads\\msedgedriver.exe");
			driver= new EdgeDriver();
		}
	}
	
	@BeforeTest
	public void url()
	{
		System.out.println("enter url");
		driver.get("https://www.mercurytravels.co.in/");
	}
	
	@BeforeClass
	public void maximize()
	{
		System.out.println("max browser");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void getcookies()
	{
		System.out.println("gt cookies");
	}
	
	@Test
	public void BusinessLogic_one() throws InterruptedException
	{
		System.out.println("Test one completed");
		
		
		Actions act= new Actions(driver);
		act.click(driver.findElement(By.xpath("(//li[@class='dropdown loggedout']/a)[2]"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@data-target='#modalLogin'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign_user_email")).sendKeys("sonawanesushil5700@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("sign_user_password")).sendKeys("Sushil@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(),'Log in')])[1]")).click();
		Thread.sleep(2000);
		WebElement x=driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		boolean TTrue=x.isDisplayed();
		if(TTrue)
		{
			x.click();
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_email")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_password")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_email")).sendKeys("sonawanesushil57@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_password")).sendKeys("Sushil@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Log in')])[1]")).click();
			Thread.sleep(2000);
		}
		
		
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		
		act.click(driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Profile')]/../following-sibling::li[2]/a)[2]")).click();
		Thread.sleep(2000);
		
	}
	
	

	
	@AfterMethod
	public void takescreenshot()
	{
		System.out.println("Take screenshot");
	}
	
	@AfterClass
	public void dltcookies()
	{
		System.out.println("dlt cookies");
	}
	
	@AfterTest
	public void dbconnectionclosed()
	{
		System.out.println("dbconnection");
	}
	
	@AfterSuite
	public void closebrowser()
	{
		System.out.println("CloseBrowser");
		driver.close();
	}
	
	}
	