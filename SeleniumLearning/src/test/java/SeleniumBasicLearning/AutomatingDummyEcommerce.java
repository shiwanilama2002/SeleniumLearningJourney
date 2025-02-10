package SeleniumBasicLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomatingDummyEcommerce {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void navigationToRegisterPage() {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		String pageTitle = driver.getTitle();
		if(pageTitle.equals("Register Account")) {
			System.out.println("Successfully navigated to register page");
		}
		else {
			System.out.println("navigation failed.");
		}
		
	}
	@Test(priority = 2)
	public void registrationProcess() throws InterruptedException {
		navigationToRegisterPage();
		driver.findElement(By.id("input-firstname")).sendKeys("Shiwani");
		driver.findElement(By.id("input-lastname")).sendKeys("Lama");
		driver.findElement(By.name("email")).sendKeys("shiwani@gmail.com");		
		driver.findElement(By.id("input-telephone")).sendKeys("012452361");
		driver.findElement(By.id("input-password")).sendKeys("Test@123");
		driver.findElement(By.name("confirm")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String titleAfterRegistration = driver.getTitle();
		if(titleAfterRegistration.equals("Your Account Has Been Created!")) {
			System.out.println("Registration successful!");
		}
		else {
			System.out.println("Registration Failed!");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
