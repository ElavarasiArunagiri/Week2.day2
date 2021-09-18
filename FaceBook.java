package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// step1:manages the driver
		WebDriverManager.chromedriver().setup();
		// step2: Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// step3: launch the url
		driver.get("https://en-gb.facebook.com/");
		// step4: maximize the browser
		driver.manage().window().maximize();
		// step5: Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Elav");
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Arun");
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9584763215");
		// Step 10: Enter the password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Elava1!");		
		// Step 11: Handle all the three drop downs
		driver.findElement(By.name("birthday_day")).sendKeys("10");	
		driver.findElement(By.name("birthday_month")).sendKeys("Mar");	
		driver.findElement(By.name("birthday_year")).sendKeys("1986");	
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']")).click();	

	}

}
