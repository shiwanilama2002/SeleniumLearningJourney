package SeleniumBasicLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1)
	public void Navigation() {
		//driver.findElement(By.linkText("Practice")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();

		String resultNav = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.equals("https://practicetestautomation.com/practice/")) {
			System.out.println("Navigation to Practice is successful");
		}
		else {
			System.out.println("Navigation to Practice is failed");
		}
		
			}
	@Test(priority = 2)
	public void loginValidCredentials() {
		Navigation();
		driver.findElement(By.xpath("//a[contains(text(),'Test Login Page')]")).click();
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.equals("https://practicetestautomation.com/logged-in-successfully/")) {
			System.out.println("Login Sucessful.");
		}
		else {
			System.out.println("Login Failed!");
		}
	}
	@Test(priority = 3)
	public void loginInValidCredentials() {
		Navigation();
		driver.findElement(By.xpath("//a[contains(text(),'Test Login Page')]")).click();
		driver.findElement(By.id("username")).sendKeys("students");
		driver.findElement(By.id("password")).sendKeys("Password1234");
		driver.findElement(By.id("submit")).click();
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.equals("https://practicetestautomation.com/logged-in-successfully/")) {
			System.out.println("Login Sucessful.");
		}
		else {
			System.out.println("Login Failed!");
		}
	}

}
