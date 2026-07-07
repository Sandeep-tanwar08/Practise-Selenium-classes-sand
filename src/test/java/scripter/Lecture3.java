package scripter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lecture3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationtesting.co.uk/");
//		List<WebElement> tags =driver.findElement(By.tagName("a"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String url = link.getAttribute("href");
			   if (url != null && !url.isEmpty()) {  // Check if the href attribute is not null or empty
	                System.out.println(url);
	            }
			   
			   
			
		}
		driver.quit();
		
	}

}
