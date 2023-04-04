package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookUsingXpath {
	public static void main(String[] args) {
EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("vasanth");
		
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("kumar");
		
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("vasanthkumar4620@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("vasanthkumar4620@gmail.com");
		
		//driver.findElement(By.xpath("//div[text()='New password']")).sendKeys("vasanth1234");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("vasanth111");
		
		WebElement dropDown = driver.findElement(By.id("day"));
		Select selectDropDown = new  Select(dropDown);
		selectDropDown.selectByValue("26");
		
		WebElement dropDown1 = driver.findElement(By.id("month"));
		Select selectDropDown1 = new  Select(dropDown1);
		selectDropDown1.selectByValue("4");
		
		WebElement dropDown2 = driver.findElement(By.id("year"));
		Select selectDropDown2 =new Select(dropDown2);
		selectDropDown2.selectByVisibleText("2001");
		
		WebElement radio = driver.findElement(By.xpath("(//input[contains(@class,'_8esa')])[2]"));radio.click();

	
		
	
		
	
	}//
}
