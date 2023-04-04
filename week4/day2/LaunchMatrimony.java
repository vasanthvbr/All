package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchMatrimony {
	public static void main(String[] args) {

	EdgeDriver driver = new EdgeDriver();
	
	driver.get("https://www.tamilmatrimony.in/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("NAME")).sendKeys("Vasanth");
	
	driver.findElement(By.id("gendermale")).click();
	
	driver.findElement(By.id("MOBILENO")).sendKeys("7358060568");
	
	driver.findElement(By.id("EMAIL")).sendKeys("Vasanthkumar@gmail.com");
	
	driver.findElement(By.name("PASSWD1")).sendKeys("vasanth");
	
	WebElement dropDown = driver.findElement(By.id("RELIGION"));
	
	Select selectDropDown = new Select(dropDown);
	
	selectDropDown.selectByVisibleText("Hindu");
	
	WebElement dropDown1 = driver.findElement(By.id("CASTE_NORMAL"));
	
	Select selectDropDown1 = new Select(dropDown);
	
	//selectDropDown1.sel
	
	
	}	
}
