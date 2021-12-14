package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open URL orangeHRM
		driver.get("https://demoqa.com/alerts");

		// Maximize window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertButton")).click();
		
		//Accept alert
		driver.switchTo().alert().accept();
		driver.quit();
		
		
	}

}
