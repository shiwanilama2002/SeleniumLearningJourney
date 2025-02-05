package SeleniumBasicLearning;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningAbtLocators {
	@Test
	public void findingLocators() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//strong[contains(text(),'English')]")).click();
		driver.findElement(By.className("cdx-text-input__input")).sendKeys("Selenium");
		 driver.findElement(By.className("cdx-search-input__end-button")).click();
		 System.out.println("The title fetched after search result is "+driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}
