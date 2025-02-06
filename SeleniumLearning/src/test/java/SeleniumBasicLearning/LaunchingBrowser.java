package SeleniumBasicLearning;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser {
	@Test
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String tittle = driver.getTitle();
		System.out.println(tittle);
		if(tittle.equals("Google")) {
			System.out.println("The test case is passed.");
		}
		else {
			System.out.println("The test case is failed.");
		}
		driver.quit();
		
	}

}
