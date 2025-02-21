package learningToInteractWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	WebDriver driver;
	@Test
	public void hoverMouse() {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Hovers")).click();
		WebElement ele = driver.findElement(By.xpath("(//div[@class='figure'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}

}
