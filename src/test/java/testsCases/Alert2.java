package testsCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Alert2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver2.exe");

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open URL demoqa
		driver.get("https://demoqa.com/alerts");

		// Maximize window
		driver.manage().window().maximize();

		//
		//driver.findElement(By.id("alertButton")).click();

		//Accept alert
		//driver.switchTo().alert().accept();

		driver.findElement(By.id("promtButton")).click();

		//Accept alert
		driver.switchTo().alert().sendKeys("ikram");
		driver.switchTo().alert().accept();

		String expectedResult = driver.findElement(By.id("promptResult")).getText();

		if (expectedResult.equals("You entered ikram")) { 

			System.out.println("PASS: accept alert ");
		} else { 
			System.out.println("FAILED: ");
		}
		driver.quit();
	}

}