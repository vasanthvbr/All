package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LeafTapUsingXpath {
	public static void main(String[] args) {
	
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Vasanth");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("kumar");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
		
		
		
}
}
