package week2.day4Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// User Name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager ");
		// Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA Link
		driver.findElement(By.xpath("//*[@id=\"label\"]/a")).click();

		// Click Lead Button
		driver.findElement(By.linkText("Leads")).click();

		// Click Find lead
		driver.findElement(By.linkText("Find Leads")).click();

		// Click Phone Menu
		driver.findElement(By.linkText("Phone")).click();
		
		//driver.findElement(By.name("phoneAreaCode")).sendKeys("91");

		// Enter Phone Number
		driver.findElement(By.name("phoneNumber")).sendKeys("9098438621");

		// Click Find Leads
		driver.findElement(By.xpath("//button[normalize-space()='Find Leads']")).click();
		Thread.sleep(1000);

		String LeadId = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']")).getText();

		System.out.println(LeadId);
		driver.findElement(By.xpath("//a[normalize-space()='13297']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys("13297");
		driver.findElement(By.xpath("//button[normalize-space()='Find Leads']")).click();
		
		
		
		
		
		
		

	}
}