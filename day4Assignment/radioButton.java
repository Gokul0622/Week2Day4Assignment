package week2.day4Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='yes']")).click();

		WebElement defaultButton = driver.findElement(By.xpath("//label[@for='Checked']"));
		Boolean radiobutton = defaultButton.isSelected();

		if (radiobutton = true) {
			System.out.println(" Default Radio Button is Already Selected ");
		} else {
			System.out.println("Default Radio Button is Not Selected");
		}

		WebElement AgeGroup = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
		Boolean defaultAgeGroup = AgeGroup.isSelected();

		if (defaultAgeGroup = true) {
			System.out.println(" Your Age Group is Already Selected ");
		} else {
			System.out.println("Your Age Group is Not Selected");
		}

	}

}
