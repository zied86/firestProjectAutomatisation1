package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;


public class RightClickDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");

		//Open chrome
		WebDriver driver = new ChromeDriver();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//Open URL orangeHRM
		driver.get("https://demoqa.com/buttons");

		//Maximize window
		driver.manage().window().maximize();
		
		Actions action =new Actions(driver);
		
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
		
		action.contextClick(btnRightClick).perform();
		
		// assert 
		String message=driver.findElement(By.id("rightClickBtn")).getText();
		Assert.assertEquals(message, "You have done a right click");
		
		
		
		

	}

}
