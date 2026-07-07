package test;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHumara {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://teststore.automationtesting.co.uk/index.php?controller=authentication?back=https%3A%2F%2Fteststore.automationtesting.co.uk%2Findex.php");
	locatorss loc= new locatorss(driver);
	Thread.sleep(3000);
	loc.getemail().sendKeys("test@gmail.com");
	Thread.sleep(3000);
	loc.getPassword().sendKeys("1234");
	Thread.sleep(3000);
	loc.signButton().click();
	}
}
