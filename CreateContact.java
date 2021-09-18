package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.xpath("//input[@id = 'firstNameField']")).sendKeys("Elavarasi");
		driver.findElement(By.xpath("//input[@id = 'lastNameField']")).sendKeys("Arunagiri");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ela");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Arun");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Selenium Learner");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ela.arunagiri@gmail.com");
		
		WebElement stPr = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stPrNe = new Select(stPr);
		stPrNe.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Learner and not an employee");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		System.out.println("The page after submitting is: " + driver.getTitle());
		//driver.close();

	}

}
