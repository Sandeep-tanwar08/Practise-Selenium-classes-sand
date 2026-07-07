package scripter;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerter {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.xpath("//*[@id=\"promptexample\"]")).click();
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(6));
		 wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		
//		alert.accept();
//		alert.dismiss();
//		alert.getText();
		alert.sendKeys("Tuje change karke rahange");
		alert.accept();
		
		
	}

}
