package week4day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		Actions builder = new Actions(driver);
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item6 =driver.findElement(By.xpath("//li[text()='Item 6']"));
		
		builder.clickAndHold(item2).moveToElement(item6).release().perform();
		
	}

}
