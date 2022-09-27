package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		//enter phone number 
		obj.findElement(By.className("phoneNumber")).sendKeys("55");
		//click find leads
		obj.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		//capture the lead id 
		
		//click first record as part of search
		obj.findElement(By.linkText("13304")).click();
		System.out.println(obj.getTitle());
		
		//Click delete record
		obj.findElement(By.linkText("Delete")).click();
		//click again find leads
		obj.findElement(By.linkText("Find Leads")).click();
		//enter lead id
		obj.findElement(By.name("id")).sendKeys("13304");
		//click find leads
		obj.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		//Verify "No records to display" in the Lead List
	}

}
