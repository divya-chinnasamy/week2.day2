package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeTest {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://acme-test.uipath.com/login");
		//maximise the browser
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		
		obj.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		obj.findElement(By.id("password")).sendKeys("leaf@12");
		obj.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		System.out.println(obj.getTitle());
		System.out.println("Login Success");
		
		obj.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		
		System.out.println(obj.getTitle());
		
	}

}
