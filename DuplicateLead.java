package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.xpath("(//span[@class ='x-tab-strip-inner'])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ela.arunagiri@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// thread.sleep to wait till the results return, else it picks the first record
		// before searching returns.
		Thread.sleep(2000);
		String leadName = driver
				.findElement(
						By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"))
				.getText();
		System.out.println("Name of the first resulting record: " + leadName);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String titleAfterClickingOnDuplicateLead = driver.getTitle();
		System.out.println("The title of the duplicate lead page: "+driver.getTitle());
		
		if(titleAfterClickingOnDuplicateLead.contains("Duplicate Lead"))
			System.out.println("The title of the duplicate lead page is as expected.");
		else
			System.out.println("Check out if you had clicked on Duplicate Lead button.");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String leadName1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(leadName1.equals(leadName))
			System.out.println("The duplicated record too has the same name: "+leadName1+", as the first result.");
		else
			System.out.println("The duplicated record has a different name: "+leadName1+", not as the first result. Pls Check.");
		//driver.close();
	}

}
