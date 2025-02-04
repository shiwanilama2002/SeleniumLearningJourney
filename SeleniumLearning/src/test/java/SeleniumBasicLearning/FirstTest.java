package SeleniumBasicLearning;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	 String url ="https://www.google.com/";
	 WebDriver driver;
	@Test
	public void openChrome() {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get(url);
		 System.out.println("Getting the title from the page"+driver.getTitle());
	}
	@Test
	public void openEdge() {
		 WebDriverManager.edgedriver().setup();
		 EdgeDriver driver = new EdgeDriver();
		 driver.get(url);
		 System.out.println("Getting the title from the page"+driver.getTitle());
	}
	
	
		 
		
	}

