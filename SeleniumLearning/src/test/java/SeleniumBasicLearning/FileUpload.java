package learningToInteractWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	@Test
	public void fileUploading() {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		String path = "D:\\test data\\tools.pdf";
		driver.findElement(By.id("file-upload")).sendKeys(path);
		driver.findElement(By.className("button")).click();
		
		
		
	}

}
