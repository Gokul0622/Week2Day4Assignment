package week2.day4Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Using Index
		WebElement DropDown1 = driver.findElement(By.id("dropdown1"));
		Select UsingIndex = new Select(DropDown1);
		UsingIndex.selectByIndex(1);

		// Using Visible Text
		WebElement DropDown2 = driver.findElement(By.name("dropdown2"));
		Select UsingVisibletext = new Select(DropDown2);
		UsingVisibletext.selectByVisibleText("Appium");

		// Using Visible Value
		WebElement DropDown3 = driver.findElement(By.id("dropdown3"));
		Select UsingValue = new Select(DropDown3);
		UsingValue.selectByValue("3");
		
		//No.Of.DropDown
		List<WebElement> GetSize = driver.findElements(By.xpath("//*[@id=\"contentblock\"]/section/div[4]"));
		int Size = GetSize.size();
		System.out.println(" No Of Size is " + Size);
		
		//Select Using Sent keys
		WebElement sentkeys = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		sentkeys.sendKeys("Loadrunner");
		
		//Multiple Select
		WebElement MultipleSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select Multiple = new Select(MultipleSelect);
		Multiple.selectByIndex(1);
		Multiple.selectByValue("2");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

		
		
		
		
		
		
		
		
		

	}

}
