package scripter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chapter3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=425916359747610255&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9181766&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
		
		driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/ul/li[1]/a/span")).click();
		
	}

}
