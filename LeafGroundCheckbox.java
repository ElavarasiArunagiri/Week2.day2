package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/checkbox.html");
		System.out.println("The first");
		driver.findElement(By.xpath("//label[@for='java']/parent::div//input")).click();

		System.out.println("The second");
		if(driver.findElement(By.xpath("(//label[@for='java']/parent::div)[2]//input")).isSelected())
			System.out.println("The checkbox is already selected");
		else
			System.out.println("The checkbox is not selected");
		
		System.out.println("The third");
		WebElement option1= driver.findElement(By.xpath("(//label[@for='java']/parent::div)[3]//input"));
		if(option1.isSelected())
			option1.click();
		WebElement option2= driver.findElement(By.xpath("((//label[@for='java']/parent::div)[3]//input)[2]"));
		if(option2.isSelected())
			option2.click();
		
		driver.findElement(By.xpath("(//div[@class='example'])[4]//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//input[@type='checkbox'])[4]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//input[@type='checkbox'])[5]")).click();

		

	}

}
