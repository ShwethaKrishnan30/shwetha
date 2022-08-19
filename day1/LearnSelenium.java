package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {
	public static void main(String[] args) {
		
	
//to add driver to the code
	//WebDriverManager.edgedriver().setup
	//WebDriverManager.firefoxdriver().setup
	//WebDriverManager.operadriver().setup
	//WebDriverManager.iedriver().setup 
	//WebDriverManager.safaridriver().setup
	WebDriverManager.chromedriver().setup();
	
	/// TO OPEN A BROWSER 
	ChromeDriver driver = new ChromeDriver();
	
	///TO LOAD AN URL
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	///TO MAXIMIS THE BROWSER
	driver.manage().window().maximize();
	
	///TO CLOSE THE BROWSER
	//driver.close();
	
	// TO FIND THE ELEMENT
	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("DEMOSALESMANAGER");
	
	//TO FIND ELEMET BY NAME
	WebElement elementpassword = driver.findElement(By.name("PASSWORD"));
	elementpassword.sendKeys("crmsfa");
	
	// TO FIND THE ELEMENT BY CLASS NAME
	WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));
	elementlogin.click();
	
	//TO FIND THE TAG NAME
	WebElement elementWelcomemessage = driver.findElement(By.tagName("h2"));
	String text = elementWelcomemessage.getText();
	System.out.println(text);
	
	//TO FIND THE ELEMENT BY LINK TEXT <A>
	WebElement elementCRMFSA = driver.findElement(By.linkText("CRM/SFA"));
	elementCRMFSA.click();
	
	WebElement elementleads = driver.findElement(By.linkText("Leads"));
	elementleads.click();
	
	WebElement elementCreatelead = driver.findElement(By.linkText("Create Lead"));
	elementCreatelead.click();
	
	WebElement elementSourceDD = driver.findElement(By.linkText("Create Lead"));
	elementCreatelead.click();

}}
