package week7.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node01eom64k2rm69p1xkzja1cn6ks1185742.node0");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	List<WebElement> findElements = driver.findElements(By.xpath("//div[contains(@class,'ui-chkbox-box')]"));
	//for (WebElement select : findElements) {
	//for (WebElement a : findElements) {
		
		//for (int i = 0; i < driver.s; i++) {
			
		}
	}
		
	//	}
	

	
