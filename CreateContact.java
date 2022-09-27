package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver obj = new ChromeDriver();
		obj.get("http://leaftaps.com/opentaps/control/main");
		//maxime the browser
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		obj.findElement(By.id("username")).sendKeys("Demosalesmanager");
		obj.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		obj.findElement(By.className("decorativeSubmit")).click();
		obj.findElement(By.linkText("CRM/SFA")).click();
		//now click contacts
		
		obj.findElement(By.linkText("Contacts")).click();
		obj.findElement(By.linkText("Create Contact")).click();
		obj.findElement(By.id("firstNameField")).sendKeys("Siva");
		obj.findElement(By.id("lastNameField")).sendKeys("Paramasivam");
		obj.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Samy");
		obj.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("KP");
		obj.findElement(By.id("createContactForm_departmentName")).sendKeys("Embeded Automotive Testing");
		obj.findElement(By.id("createContactForm_description")).sendKeys("Car Chasis");
		obj.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kpsiva@gmail.com");
		//dropdown selection for State/Province
		
		WebElement source = obj.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		//create a Select class and pass the webelement;
		Select dd = new Select(source);
		//use the obj and call the method
		dd.selectByVisibleText("New York");
		
		//Contact creation
		obj.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(obj.getTitle());
		System.out.println("Contact created");
		
		//Editing the contact
		obj.findElement(By.linkText("Edit")).click();
		obj.findElement(By.id("updateContactForm_description")).clear();
		obj.findElement(By.id("updateContactForm_importantNote")).sendKeys("this is important note for contact creation");
		
		//update button clicking using Xpath
		obj.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
		
		System.out.println(obj.getTitle());


	}

}
