package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class ='x-tab-strip-inner'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9940009391");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// thread.sleep to wait till the results return, else it picks the first record
		// before searching returns.
		Thread.sleep(2000);
		String leadId = driver
				.findElement(
						By.xpath("//td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a"))
				.getText();
		System.out.println("ID of the first resulting record: " + leadId);
		driver.findElement(
				By.xpath("//td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a"))
				.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String pagingInfo = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out
				.println("The records paging info on searching with ID " + leadId + ", after delete record: " + pagingInfo);
		String pageDisplay = "No records to display";
		if (pagingInfo.contains(pageDisplay))
			System.out.println("The record with ID" + leadId + " is deleted");

		else
			System.out.println("The record with ID" + leadId + " is not deleted");
		//driver.close();
	}

}
