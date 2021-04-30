package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch chrome driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		//Launch URL
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		//Login

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("//label[text()='Email Address:']/following::input")).sendKeys("bkarthi25@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		
		String LeadName = driver.findElement(By.xpath("//div[@class= 'x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		
		//	Click First Resulting lead
		driver.findElement(By.xpath("//div[@class= 'x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		Thread.sleep(4000);
		
		//	Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(4000);
		
		//	Verify the title as 'Duplicate Lead'
		String title = driver.getTitle();
		if(title.contains("Duplicate Lead"))
			System.out.println("Navigated to Duplicate Lead Page");
		else
			System.out.println("Not Navigated to Duplicate Lead Page");
		
		//	Click Create Lead
		driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
		Thread.sleep(4000);
		
		//	Confirm the duplicated lead name is same as captured name
		String DupLeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(LeadName.equals(DupLeadName))
			System.out.println("Lead Duplicated");
		else
			System.out.println("Lead not Duplicated");
		
		//	Close the browser (Do not log out)
		driver.close();
	
		
	}
}
