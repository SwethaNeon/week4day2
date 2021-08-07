package week4day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentMouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Actions builder = new Actions(driver);
		 WebElement webTestleafCourses =driver.findElement(By.linkText("TestLeaf Courses"));
		
		builder.moveToElement(webTestleafCourses).perform();
		driver.switchTo().defaultContent();
		
		//second question:
		
       WebElement webTestleafCourses1 =driver.findElement(By.linkText("TestLeaf Courses"));
		
		builder.moveToElement(webTestleafCourses).perform();
		
		driver.findElement(By.linkText("WebServices")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
	}

}
