package scripter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chapter2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		element.sendKeys("Apple");
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		
		
	}

}
