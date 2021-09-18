package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// step1:manages the driver
		WebDriverManager.chromedriver().setup();
		// step2: Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// step3: launch the url
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// step4: maximize the browser
		driver.manage().window().maximize();
		// step5: Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Step 6: Fill in all the text boxes
		driver.findElement(By.name("UserFirstName")).sendKeys("Elav");
		driver.findElement(By.name("UserLastName")).sendKeys("Arun");
		driver.findElement(By.name("UserEmail")).sendKeys("a@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("8945623514");
		// Step 7: Handle all the dropdowns
		driver.findElement(By.name("UserTitle")).sendKeys("Sales Manager");
		driver.findElement(By.name("CompanyEmployees")).sendKeys("1 - 15 employees");
		
		// say method1 to find country and select India.
		driver.findElement(By.xpath("//select[@name='CompanyCountry']")).sendKeys("India");
		
		// method2  This fails the run as this enables the tag msg over the agree checkbox.
		//driver.findElement(By.xpath("//select[@name='CompanyCountry']/option[starts-with(text(),'I')][2]")).click();
		
		//method3  This would be successful run only if the company state find and send value statement is commented.
		/*WebElement country = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		  Select selCntry = new Select(country);
		  selCntry.selectByVisibleText("India");*/
		
		driver.findElement(By.name("CompanyState")).sendKeys("Tamil Nadu");
		
		// Step 8: Click the check box
		driver.findElement(By.xpath("//div[@class = 'checkbox-ui']")).click();
		
		//driver.close();
	}

}
