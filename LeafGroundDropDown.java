package week2.day2.assignments;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LeafGroundDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select value1=new Select(dropdown1);
		value1.selectByIndex(1);
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select value2=new Select(dropdown2);
		value2.selectByVisibleText("UFT/QTP");
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select value3=new Select(dropdown3);
		value3.selectByValue("2");

		WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		Select value4 = new Select(dropdown4);
		List<WebElement> nvalue4 = value4.getOptions();
		System.out.println("There are "+nvalue4.size()+"options in dropdown4");
		
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Loadrunner");
		
        WebElement listDown = driver.findElement(By.xpath("(//div[@class='example'])[6]/select"));
        Select list = new Select(listDown);
		list.selectByValue("3");
		

	}

}
