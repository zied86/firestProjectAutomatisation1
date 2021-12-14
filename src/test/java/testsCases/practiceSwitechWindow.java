package testsCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceSwitechWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open URL orangeHRM
		driver.get("https://demoqa.com/browser-windows/");

		// Maximize window
		driver.manage().window().maximize();

		// store and print the name of the first window 
		String handle = driver.getWindowHandle();

		System.out.println(handle);

		// click on the button new window message 
		driver.findElement(By.id("messageWindowButton")).click();


		// store and print the name of windows open 

		Set<String> handl = driver.getWindowHandles();
		System.out.println(handl);

		//  pass a window handle to other window 

		for (String handle1 : driver.getWindowHandles()) {

			driver.switchTo().window(handle1);
			System.out.println("handle1");


		}





	}

}
