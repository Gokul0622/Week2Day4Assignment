package week2.day4Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//select the language you know
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
		
		//Confirm Selenium is checked
		WebElement CheckBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		Boolean checkbox = CheckBox.isSelected();
		if(checkbox=true)
			System.out.println(" Confiremed Selenium CheckBox  is already selected ");
		else
			System.out.println(" Confirm Selenium checkBox is not Selected ");
		
		
		//DeSelect only checked
		WebElement FirstElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		if(FirstElement.isSelected())
			FirstElement.click();
		
		WebElement SecondElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		if(SecondElement.isSelected())
			SecondElement.click();
		
		//Select all below checkboxes
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
