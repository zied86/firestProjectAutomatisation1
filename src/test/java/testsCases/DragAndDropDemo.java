package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open URL orangeHRM
		driver.get("https://demoqa.com/droppable/");

		// Maximize window
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		action.dragAndDrop(from, to).perform();

		String textTo = to.getText();
		if (textTo.equals("Dropped!")) {
			System.out.println("Pass: source is dropred to target as expected");
		} else {

			System.out.println("Failed : source couldn't be dropped as expected");
		}
		
		driver.quit();
		
	}

}
