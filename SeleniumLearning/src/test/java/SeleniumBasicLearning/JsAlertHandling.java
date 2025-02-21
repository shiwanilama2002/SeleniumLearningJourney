package learningToInteractWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsAlertHandling {
	@Test
	public void jsAlert() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//handling simple alert
//		driver.findElement(By.xpath("//li/button[text()='Click for JS Alert']")).click();
//		driver.switchTo().alert().accept();
		
//		//handling confirmation alert
//		driver.findElement(By.xpath("//li/button[text()='Click for JS Confirm']")).click();
////		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();

		//handling the prompt alert
		driver.findElement(By.xpath("//li/button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("hy!");
		driver.switchTo().alert().accept();
		
		
	}
}
