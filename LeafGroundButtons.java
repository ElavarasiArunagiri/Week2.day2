package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButtons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("home")).click();
		System.out.println("The url of the landed page: "+driver.getCurrentUrl());
		System.out.println("The title of the landed page: "+driver.getTitle());
		
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		
		System.out.println("The X position of the 'Get Position' button: "+driver.findElement(By.id("position")).getLocation().x);
		System.out.println("The X position of the 'Get Position' button: "+driver.findElement(By.id("position")).getLocation().getY());
		
		System.out.println("The color of the 'What color am I?' button: "+driver.findElement(By.id("color")).getCssValue("background-color"));

		System.out.println("The Height position of the 'What is my size?' button: "+driver.findElement(By.id("size")).getSize().getHeight());
		System.out.println("The Width position of the 'What is my size?' button: "+driver.findElement(By.id("size")).getSize().width);
		
	}

}
