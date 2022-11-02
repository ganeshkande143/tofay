package Basic_Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Webdriver_methods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Automation Jars and drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		WebElement fliplart=driver.findElement(By.xpath("//img[@title='Flipkart']"));
		
		boolean TTrue=fliplart.isDisplayed();
		
		if(TTrue)
		{
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			
		}
		else
		{
			driver.close();
		}
		
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		
		
		driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 13 (Pink, 128 GB)')]")).click();
		Thread.sleep(3000);
		
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		Thread.sleep(1000);
		
		
		for(String x: allwindows)
		{
			driver.switchTo().window(x);
		}
		
		
		
		String price=driver.findElement(By.xpath("(//div[@class='CEmiEU']/div/div)[1]")).getText();
		System.out.println(price);
		
		Thread.sleep(2000);
		
	
		
		
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(2000);
		driver.quit();

	}

}
