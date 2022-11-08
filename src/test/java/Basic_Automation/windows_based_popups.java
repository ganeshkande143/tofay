package Basic_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_based_popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Automation Jars and drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123456879");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().alert().accept();
		
		/*
		 * driver.switchTo().alert().dismiss(); driver.switchTo().alert().sendKeys("");
		 */
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='reset']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.close();
		
		
		
	}

}
