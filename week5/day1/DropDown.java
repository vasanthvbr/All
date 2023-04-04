package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dropDown = driver.findElement(By.className("ui-selectonemenu"));
		Select selectDropDown = new Select(dropDown);
		selectDropDown.selectByVisibleText("Selenium");
		
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.id("j_idt87:country_3")).click();
		
		Thread.sleep(300);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'ui-a')]/button")).click();
		driver.findElement(By.xpath("(//li[contains(@class,'ui-autocomplete-l')])[3]")).click();
		
		driver.findElement(By.xpath("//li[text()='Select Language']")).click();
		//driver.findElement(By.xpath("//li[contains(@class,'ui-selectonemenu-item)]"))

	}
}
