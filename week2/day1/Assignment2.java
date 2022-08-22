package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("DEMOSALESMANAGER");
		
		WebElement elementpassword = driver.findElement(By.id("password"));
		elementpassword.sendKeys("crmsfa");
		
		WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));
		elementlogin.click();
		
		WebElement elementCRMFSA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMFSA.click();
		
		WebElement elementleads = driver.findElement(By.linkText("Leads"));
		elementleads.click();
		
		WebElement elementCreatelead = driver.findElement(By.linkText("Create Lead"));
		elementCreatelead.click();
		
		WebElement elemementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elemementCompanyName.sendKeys("TESTLEAF");
		
		WebElement elemementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elemementFirstName.sendKeys("TEST");
		
		WebElement elemementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elemementLastName.sendKeys("LEAF");
		
		WebElement elemementfirstNamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elemementfirstNamelocal.sendKeys("TEST");
		
		WebElement elemementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
		elemementDepartment.sendKeys("TEST");
		
		WebElement elemementDescription = driver.findElement(By.id("createLeadForm_description"));
		elemementDescription.sendKeys("TESTLEAF IN DETAILED LEARNING");
		
		
		WebElement elementEmailID = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmailID.sendKeys("shwethasivaramani30@gmail.com");
		
		WebElement elementCreateLead = driver.findElement(By.className("smallSubmit"));
		elementCreateLead.click();
		
		//System.out.println("The title is :" +driver.getTitle());
		
		
		WebElement elementDuplicate = driver.findElement(By.linkText("Duplicate Lead"));
		elementDuplicate.click();
		
		
		
		WebElement elemementNewCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elemementNewCompanyName.clear();
		
		WebElement elemementNewCompanyName1 = driver.findElement(By.id("createLeadForm_companyName"));
		elemementNewCompanyName1.sendKeys("LEAFTEST");
		
		WebElement elemementFirstName1 = driver.findElement(By.id("createLeadForm_firstName"));
		elemementFirstName1.clear();
		
		
		WebElement elemementFirstName2 = driver.findElement(By.id("createLeadForm_firstName"));
		elemementFirstName2.sendKeys("LEAF");
		
		WebElement elementCreateLead1 = driver.findElement(By.className("smallSubmit"));
		elementCreateLead1.click();
		
		System.out.println("The title is :" +driver.getTitle());
		
		//WebElement xPATHelementCreateLead1 = driver.findElement(By.xpath("//span[@ class='Create Lead'"));
		//xPATHelementCreateLead1.click();
	}
	

}



