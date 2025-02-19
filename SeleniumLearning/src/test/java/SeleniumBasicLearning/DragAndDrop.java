package learningToInteractWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	WebDriver driver;
	@Test
	public void dragDrop() {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Drag and Drop")).click();
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement target = driver.findElement(By.id("column-b"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
//		driver.quit();
	}
}
