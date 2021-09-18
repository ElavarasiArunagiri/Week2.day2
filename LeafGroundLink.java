package week2.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		String url = "http://leafground.com/home.html";
		String urlLanding = driver.getCurrentUrl();
		System.out.println("Clicking on Go to Home Page takes to home page of LeafGround: "+urlLanding.equals(url));
		System.out.println("The title of the landed page: "+driver.getTitle());
		System.out.println("");
		driver.get("http://leafground.com/pages/Link.html");
		String findWoClick = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("click on 'Find where am supposed to go without clicking me?' might take to : "+findWoClick);
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		System.out.println("clicking on it work as expected - "+findWoClick.equals(driver.getCurrentUrl()));
		System.out.println("");
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String titleOfPage = driver.getTitle();
		if(titleOfPage.contains("Not Found"))
			System.out.println("The 'Verify am I broken?' takes to error page.");
		else
			System.out.println("The 'Verify am I broken?' is not broken");
		
		System.out.println("");
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("//label[@for='position']/preceding-sibling::a")).click();
		System.out.println("The current page :"+driver.findElement(By.className("wp-page-heading")).getText());
		System.out.println("To check if this page HyperLink takes to links page");
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[3]")).click();
		System.out.println("The title of the page is 'Interact with HyperLinks' - "+((driver.getTitle()).contains("Interact with HyperLinks")));
		
		System.out.println("");
		String tagName = driver.findElement(By.linkText("How many links are available in this page?")).getTagName();
		List<WebElement> links = driver.findElements(By.tagName(tagName));
		System.out.println("The number of links is in this page: " + links.size());
		
		
		
		
	}

}
