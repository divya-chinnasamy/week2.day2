package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		
		//now click leads
		obj.findElement(By.linkText("Leads")).click();
		//click find leads
		obj.findElement(By.linkText("Find Leads")).click();
		//input first name
		obj.findElement(By.name("firstName")).sendKeys("Divya");
		//clicking first record after find
		obj.findElement(By.linkText("10598")).click();
		//print the title of the page
		System.out.println(obj.getTitle());
				
		//clcik edit
		obj.findElement(By.linkText("Edit")).click();
		//change the company name
		obj.findElement(By.id("updateLeadForm_companyName")).sendKeys("NitinDeesh Co Ltd");
		//click update
		obj.findElement(By.className("smallSubmit")).click();
		
		//view the udated result
		System.out.println(obj.getTitle());
		System.out.println("Record updated");
		
		obj.close();
		
		
	}
}
