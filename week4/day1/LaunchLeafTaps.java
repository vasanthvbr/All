package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchLeafTaps {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		//load the application ,htp - hyper text transport protocol
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//Enter the user as Demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vasanth");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select selectSourceDropDown = new Select(sourceDropDown);
		
		//selectSourceDropDown.selectByIndex(1);
		selectSourceDropDown.selectByVisibleText("Employee");
	//	selectSourceDropDown.selectByValue("LEAD_EXISTCUST");
		
		
		
		
		
		//driver.findElement(By.name("submitButton")).click();
		
		
		}
		
	}



