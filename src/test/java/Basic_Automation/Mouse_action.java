package Basic_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Automation Jars and drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement source= driver.findElement(By.xpath("(//div[contains(text(),'Washington')])[2]"));
		WebElement Target= driver.findElement(By.xpath("(//div[contains(text(),'Italy')])"));
		
		Actions ac= new Actions(driver);
		ac.dragAndDrop(source, Target).build().perform();
		Thread.sleep(3000);
		
		driver.close();

	}

}
