package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadDemo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open URL orangeHRM
		driver.get("http://demo.guru99.com/test/upload/");

		// Maximize window
		driver.manage().window().maximize();

		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		uploadFile.sendKeys("C:\\Users\\zss\\Desktop\\psm\\PSM_1&2_brut (4).pdf");
		driver.findElement(By.id("terms")).click();
		//driver.findElement(By.id("submitbutton")).click();

		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		driver.navigate().forward();

		//scroll window
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 400)","");	
		WebElement submit =driver.findElement(By.id("submitbutton"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",submit);
		
		
		//Sendkeys with javascript executor
		
		JavascriptExecutor executorScript = (JavascriptExecutor) driver;
		executorScript.executeScript("document.getElementById('id').value='text';");


	}

}
