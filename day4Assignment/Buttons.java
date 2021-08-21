package week2.day4Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Click button to travel home page

		WebElement HomeButton = driver.findElement(By.xpath("//button[@id='home']"));
		HomeButton.click();
		driver.navigate().back();
		
		//Find position of button (x,y)
		WebElement getPosiiton = driver.findElement(By.xpath("//button[@id='position']"));
		Point point = getPosiiton.getLocation();
		int xValue = point.getX();
		System.out.println(" Position of Button X is " + xValue);
		int yValue = point.getY();
		System.out.println(" Position of Button Y is " + yValue);
		
		//Find button color
		WebElement ButtonColor = driver.findElement(By.xpath("//button[@id='color']"));
		String Color = ButtonColor.getCssValue("background-color");
		System.out.println(" Button Color is " + Color);
		
		//Find the height and width
		WebElement Size = driver.findElement(By.xpath("//button[@id='size']"));
		Dimension Buttonsize = Size.getSize();
		int Height  = Buttonsize.getHeight();
		System.out.println(" Button Height is " + Height);
		int Width = Buttonsize.getWidth();
		System.out.println(" Width of the Button is " + Width);
		
		
		
		
		

	}

}
