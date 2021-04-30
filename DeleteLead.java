
package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	//private static String String;

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
		driver.findElement(By.xpath("(//a[@class='x-tab-right'])[2]")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();

		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("413");
		driver.findElement(By.name("phoneNumber")).sendKeys("8668037300");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String firstlead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText();
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.name("id")).sendKeys(firstlead);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		 String norecords = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		 
		 if(norecords.contains("No records to display")) {
			 System.out.println("Delete success. Lead record not available");
		 }
		 else
		 {
			 System.out.println("Lead record available. Delete failed");
		 }
		 
		 driver.close();
		
		
}
}
