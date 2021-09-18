package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Elavarasi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// thread.sleep to wait till the results return, else it picks the first record
		// before searching returns.
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();

		System.out.println("The loaded page after a click on the resulting record: " + driver.getTitle());

		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement compName = driver.findElement(By.id("updateLeadForm_companyName"));
		String exCompName = compName.getAttribute("value");
		compName.clear();
		String upCompName = "CompName";
		compName.sendKeys(upCompName);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String upCompName1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (upCompName1.contains(upCompName))
			System.out.println("The company name is updated to " + upCompName + " from " + exCompName);
		else
			System.out.println(
					"The company name is not updated to " + upCompName + " from " + exCompName + ". Pls Check.");
		//driver.close();

	}

}
