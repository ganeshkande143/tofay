package Basic_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Automation Jars and drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement source = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']/img)[1]"));
		WebElement target = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		
		action.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		String val=driver.findElement(By.xpath("//div/h1[contains(text(),'Drag And Drop')]")).getText();
		System.out.println(val);
		
		driver.close();

	}

}
