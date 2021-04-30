package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
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
		
		//Contacts
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		// Form Filling
		
		driver.findElement(By.id("firstNameField")).sendKeys("Karthigayan");
		driver.findElement(By.id("lastNameField")).sendKeys("Balasundaram");
		driver.findElement(By.id("createContactForm_firstNameLocal")).click();
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Karthi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("bala");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software Division");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Creating this for testing purpose");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("bkarthi25@gmail.com");
     	  WebElement drpstate = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		  Select State = new Select(drpstate);
		  State.selectByVisibleText("New York");
     	driver.findElement(By.className("smallSubmit")).click();
     	
     	//Edit
     	driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
     	driver.findElement(By.id("updateContactForm_description")).clear();
     	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Test case execution");
     	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
     	
     	//Title
     	String title = driver.getTitle();
     	System.out.println("Title is: "+title);

	}

}
