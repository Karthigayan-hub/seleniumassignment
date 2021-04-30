package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		
		// 	Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//	Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				  
		//	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
						
		//	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
						
		//	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
						
		//	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
					
		//	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(5000);
		
		// 	Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("karthigayan");
		
		//	Click find leads button
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(4000);
				
		//	Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		
		//  Verify title of the page
		String title = driver.getTitle();
		if(title.contains("View Lead"))
			System.out.println("Lead is viewed");
		else
			System.out.println("Lead is not viewed");
		String oldCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String comp1 = oldCompanyName.replaceAll("[^a-zA-Z]", "");
		System.out.println("Company Name-"+comp1);
		
		//  Click Edit
		driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
		
		// Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("ABC");
		
		// Click Update
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();
		
		// Confirm the changed name appears
		String newCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String comp2 = newCompanyName.replaceAll("[^a-zA-Z]", "");
		System.out.println("Updated Company Name-"+comp2);
		
		if(comp1.equals(comp2))
			System.out.println("Lead edit is not done");
		else
			System.out.println("Lead Edit is done");
		
		// Close the browser (Do not log out)
		driver.close();

	
	
	
	}
	
	
	
	
}
