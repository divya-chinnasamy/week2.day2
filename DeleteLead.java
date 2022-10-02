package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		//Click Phone tab to find lead based on phone number
		obj.findElement(By.xpath("//span[text()='Phone']")).click();
		//Input phone number to find lead
		obj.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("123456");
		Thread.sleep(2000);
		//click find leads
		obj.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
//		
//		//capture the lead id 
		String leadid = obj.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadid);
		
		Thread.sleep(3000);
//		//click first record as part of search
		obj.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		System.out.println(obj.getTitle());
		
		
//		//Click delete record
		obj.findElement(By.linkText("Delete")).click();
//		//click again find leads
		obj.findElement(By.linkText("Find Leads")).click();
		
		Thread.sleep(1000);
//		//enter lead id
		obj.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys("13402");
//		//click find leads
		obj.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		//Verify "No records to display" in the Lead List
		String ss = obj.findElement(By.xpath("//div[@class='x-paging-info']")).getText();	
		System.out.println(ss);
	}

}
