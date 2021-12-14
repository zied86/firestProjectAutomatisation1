package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHver2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open URL orangeHRM
		driver.get("https://demoqa.com/slider/");

		// Maximize window
		driver.manage().window().maximize();

		Actions action = new Actions( driver);

		WebElement slider = driver.findElement(By.id("sliderContainer"));
		action.moveToElement(slider, 50, 0).perform();
		slider.click();

		action.moveToElement(slider, 20, 0).perform();
		slider.click();
	}

}
