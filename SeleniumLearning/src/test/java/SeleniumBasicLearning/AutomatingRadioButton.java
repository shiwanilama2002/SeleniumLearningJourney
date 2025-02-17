package learningToInteractWithWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomatingRadioButton {
	 WebDriver driver;
	 @Test
	 public void radioBtn() {
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		 driver.get("https://letcode.in/test");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[contains(text(),'Toggle')]")).click();
		 driver.findElement(By.id("yes")).click();
		 driver.findElement(By.id("two")).click();
		 driver.findElement(By.id("nobug")).click();
		 WebElement radiobtn = driver.findElement(By.id("maybe"));
		 radiobtn.click();
		 if(radiobtn.isSelected()) {
			 System.out.println("Button Selected.");
		 }
		 else {
			 System.out.println("Button disabled.");
		 }
		List<WebElement> radioList = driver.findElements(By.className("radio"));
		System.out.println("The number Of radio button of this page is: "+radioList.size());
		System.out.println("The radiobuttons on the page is:");
		for(WebElement e :radioList) {
			System.out.println(e.getText());
		}
		 
	 }

}
