package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locatorss {
	
	WebDriver driver;
	
	public  locatorss(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By Email= By.xpath("//*[@id=\"field-email\"]");
	By Password= By.xpath("//*[@id=\"field-password\"]");
	By signIn= By.xpath("//*[@id=\"submit-login\"]");
		
		
		
		public WebElement getemail() {
			return driver.findElement(Email);
		}
		
		public WebElement getPassword() {
			return driver.findElement(Password);
		}
		public WebElement signButton() {
			return driver.findElement(signIn);
		}
		
	}


