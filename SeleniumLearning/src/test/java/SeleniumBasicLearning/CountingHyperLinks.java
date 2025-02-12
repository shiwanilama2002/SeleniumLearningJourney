package SeleniumBasicLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountingHyperLinks {
	WebDriver driver;
	@Test
	public void countHyperLinks() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		List<WebElement> listLink = driver.findElements(By.tagName("a"));
		System.out.println("The count of the presented link is "+listLink.size());
		for(WebElement e:listLink) {
			System.out.println(e.getText());
		}
		
		
	}
}
