package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("ela.arunagiri@gmail.com");
		WebElement appendTab = driver.findElement(By.xpath("//label[contains(text(),'Append a text and press keyboard tab')]/following-sibling::input"));
		appendTab.sendKeys("abcd");
		appendTab.sendKeys(Keys.TAB);
		System.out.println("The default value in the 'Get default text entered' field : "+driver.findElement(By.xpath("//input[@name ='username']")).getAttribute("value"));
		driver.findElement(By.xpath("(//input[@name ='username'])[2]")).clear();
		boolean enabled = driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isEnabled();
		System.out.println("Is the 'Confirm that edit field is disabled' field enabled? " + enabled);

	}

}
