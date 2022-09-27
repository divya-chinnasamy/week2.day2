package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver obj = new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		obj.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		
		// Step 5: Add implicit wait
		obj.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Step 6: Click on Create New Account button
		obj.findElement(By.linkText("Create New Account")).click();
		
		// Step 7: Enter the first name
		obj.findElement(By.name("firstname")).sendKeys("NitinDeesh");
		
		// Step 8: Enter the last name
		obj.findElement(By.name("lastname")).sendKeys("Siva");
		
		// Step 9: Enter the mobile number
		obj.findElement(By.name("reg_email__")).sendKeys("9842576763");
		
		// Step 10: Enterthe password
		obj.findElement(By.id("password_step_input")).sendKeys("abc@123");
		
		// Step 11: Handle all the three drop downs
		WebElement source = obj.findElement(By.id("day"));		
		Select dd = new Select(source);	
		dd.selectByVisibleText("24");
		
		WebElement source1 = obj.findElement(By.id("month"));		
		Select dd1 = new Select(source1);	
		dd1.selectByVisibleText("Feb");
		
		WebElement source2 = obj.findElement(By.id("year"));		
		Select dd2 = new Select(source2);	
		dd2.selectByVisibleText("2011");
		
		// Step 12: Select the radio button "Female" 
//		            ( A normal click will do for this step) 
		
		obj.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		

		
	

	}

}
