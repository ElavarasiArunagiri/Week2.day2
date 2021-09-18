package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.findElement(By.xpath("//div[@id='first']/label")).click();
		System.out.println("The first option of second question is default selected - "+driver.findElement(By.xpath("//input[@name='news']")).isSelected());
		System.out.println("The second option of second question is default selected - "+driver.findElement(By.xpath("(//input[@name='news'])[2]")).isSelected());
		
		if(driver.findElement(By.xpath("//input[@name='age'][2]")).isSelected())
			System.out.println("The option '21 - 40 years' is already selected by default");
		else
			driver.findElement(By.xpath("//input[@name='age'][2]")).click();
	}

}
