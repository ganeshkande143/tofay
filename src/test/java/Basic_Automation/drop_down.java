package Basic_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Automation Jars and drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement drop_down= driver.findElement(By.id("dropdown-class-example"));
		
		Select s= new Select(drop_down);
		/*
		 * s.selectByIndex(2); s.selectByValue("option3");
		 */
		s.selectByVisibleText("Option3");
		
		
		
		
		Thread.sleep(3000);
		s.deselectByValue("Select");
		Thread.sleep(3000);
		driver.close();

	}

}
