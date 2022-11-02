package Basic_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_scroll_down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Automation Jars and drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tus.io/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='js-file-input']")).sendKeys("C:\\Users\\DELL\\Desktop\\Study");
		Thread.sleep(3000);
		//JavascriptExecutor js1= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(3000);
		driver.close();
		
	}

}
