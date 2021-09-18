package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//label[@for='home']/following-sibling::img")).click();
		System.out.println("Clicking on Home image takes to :"+driver.getTitle());
		driver.findElement(By.xpath("//h5[text()='Image']")).click();
		System.out.println("");
		System.out.print("The broken image will have no link associated to click on, the onclick attribute availability : ");
		System.out.println(driver.findElement(By.xpath("//label[@for='position']/following-sibling::img")).getAttribute("onclick"));
		System.out.println("");
		driver.findElement(By.xpath("(//label[@for='position']/following-sibling::img)[2]")).click();
		System.out.println("keyboard image to click the image takes to :"+driver.getTitle());
	}
	

}
