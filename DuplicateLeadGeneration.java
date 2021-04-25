package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();


		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Eram Infotech");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthigayan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balasundaram");
		WebElement dropdown11 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select bbc = new Select(dropdown11);
		bbc.selectByVisibleText("Website");

			
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select abc = new Select(dropdown1);
		abc.selectByVisibleText("Car and Driver");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Karthi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("bala");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/2/1987");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT Department");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2500000");
	
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select bcd = new Select(dropdown2);
		bcd.selectByVisibleText("INR - Indian Rupee");

		WebElement dropdown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select cde = new Select(dropdown3);
		cde.selectByVisibleText("Finance");

		
		WebElement dropdown4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select def = new Select(dropdown4);
		def.selectByVisibleText("Corporation");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1034");
		
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("643");

		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is for sample program");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Test program");
		
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+966");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("768");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9894078689");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("07");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Karthi bala");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("barthi25@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Karthi");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("bala");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No:63");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("first Floor");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("pondicherry");
		
		
		WebElement dropdown5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select efg = new Select(dropdown5);
		efg.selectByVisibleText("Indiana");

		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("605110");
		
		WebElement dropdown6 = driver.findElement(By.name("generalCountryGeoId"));
		Select fgh = new Select(dropdown6);
		fgh.selectByVisibleText("India");

		
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("7545");
		driver.findElement(By.className("smallSubmit")).click();
		
		
//Duplicate lead name change
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Company");
		driver.findElement(By.className("smallSubmit")).click();

		String txt =driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.print(txt);
		
		
		if (txt.contains("ABC Company"))
		{
		System.out.println("Duplicate lead is generated successfully");
	}	
		else
		
		{
			System.out.println("Company name is not changed");
	}
		
		

	

		

		
		
		
		
	}

}
