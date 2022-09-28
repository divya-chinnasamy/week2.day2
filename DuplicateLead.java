package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
//		1	Launch the browser
		ChromeDriver obj = new ChromeDriver();
		obj.get("http://leaftaps.com/opentaps/control/main");
		System.out.println(obj.getTitle());
		
//		2	Enter the username
		obj.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
//		3	Enter the password
		obj.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
//		4	Click Login
		obj.findElement(By.className("decorativeSubmit")).click();

		//		5	Click crm/sfa link
		obj.findElement(By.linkText("CRM/SFA")).click();
	
//		6	Click Leads link
		obj.findElement(By.linkText("Leads")).click();

//		7	Click Find leads
		obj.findElement(By.linkText("Find Leads")).click();
		
//		8	Click on Email
		obj.findElement(By.xpath("//span[text()='Email']")).click();
		
//		9	Enter Email
		obj.findElement(By.xpath("//input[@id='ext-gen282']")).sendKeys("divya.chinnasamy@gmail.com");
		
//		10	Click find leads button
		obj.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		Thread.sleep(3000);
		
//		11	Capture name of First Resulting lead
		
//		12	Click First Resulting lead
		obj.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
//		13	Click Duplicate Lead
		obj.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(2000);
		
//		14	Verify the title as 'Duplicate Lead'
		System.out.println(obj.getTitle());
		
//		15	Click Create Lead
		obj.findElement(By.className("smallSubmit")).click();
		
//		16	Confirm the duplicated lead name is same as captured name
		
//		17	Close the browser (Do not log out)
		obj.close();
	}

}
