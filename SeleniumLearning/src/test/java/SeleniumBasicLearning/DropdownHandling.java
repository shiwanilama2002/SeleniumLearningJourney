package SeleniumBasicLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling {
	WebDriver driver;
	@Test
	public void dropDown() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		Select select = new Select(driver.findElement(By.id("fruits")));
		select.selectByVisibleText("Apple");
		Select select1 = new Select(driver.findElement(By.id("superheros")));
		select1.selectByVisibleText("The Avengers");
		select1.selectByContainsVisibleText("Daredevil");
		Select select2 = new Select(driver.findElement(By.id("lang")));
		select2.selectByValue("py");
		Select select3 = new Select(driver.findElement(By.id("country")));
		select3.selectByValue("India");
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
