package week2.day4Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//User Name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager ");
		//Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA Link
		driver.findElement(By.xpath("//*[@id=\"label\"]/a")).click();
		
		//Click on contacts Button
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		//Click on Create Contact
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Local");
		
		//Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Local");
		
		//Department Name
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("xyz");
		
		//Description Name
		driver.findElement(By.id("createContactForm_description")).sendKeys("Sample Description");
		
		//Email Id
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("xyz@gmail.com");
		
		//State
		WebElement StateField = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select DropDown = new Select(StateField);
		DropDown.selectByVisibleText("New York");
		
		//Click Create Contact
		driver.findElement(By.name("submitButton")).click();
		
		//Edit Button
		driver.findElement(By.xpath("//*[@id=\"ext-gen1168\"]")).click();
		//Clear
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("testtest");
		//update Button
		driver.findElement(By.name("submitButton")).click();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
