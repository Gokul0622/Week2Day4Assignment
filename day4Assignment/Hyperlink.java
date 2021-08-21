package week2.day4Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Go to Home Page
		WebElement HomePage = driver.findElement(By.linkText("Go to Home Page"));
		HomePage.click();
		driver.navigate().back();

		//Find where am supposed to go
		WebElement Link2 = driver.findElement(By.partialLinkText("Find where am supposed to go"));
		String FindWhereIamGoing = Link2.getAttribute("href");
		System.out.println(" Find where am supposed to go without clicking me? " + FindWhereIamGoing);

		// Interact with same link name
		WebElement Link4 = driver.findElement(By.xpath("//label[@for='position']/preceding::a[1]"));
		Link4.click();
		driver.navigate().back();

		// How Many Links Available in the Page:
		List<WebElement> NoOfLinks = driver.findElements(By.tagName("a"));
		int Size= NoOfLinks.size();
		System.out.println("No Of Links in the Page is " + Size);

	}

}
