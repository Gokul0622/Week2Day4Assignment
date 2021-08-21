package week2.day4Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Email Text Bob:
		WebElement EmailBox = driver.findElementByXPath("//input[@id='email']");
		EmailBox.sendKeys("gokul.raj600@gmail.com");

		// Append Text Box:
		WebElement AppendBox = driver.findElementByXPath("//input[@value='Append ']");
		AppendBox.sendKeys(" text ");

		// getting the attribute in the Text Box:
		String text = driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value");
		System.out.println(text);
		
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		
		WebElement disabledbox= driver.findElement(By.xpath("//label[@for='disabled']"));
		Boolean Textbox = disabledbox.isEnabled();
		if(Textbox=false) 
			System.out.println( "Textbox is Enalbled");
			else
				System.out.println("Textbox is Disabled");
					
		}
		
//		
		
	}


