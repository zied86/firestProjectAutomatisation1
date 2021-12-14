package testsCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");

		//Open chrome
		WebDriver driver = new ChromeDriver();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//Open URL orangeHRM
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//Maximize window
		driver.manage().window().maximize();

		// Fill Username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		// Fill Password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// Click login button 
		//driver.findElement(By.id("btnLogin")).click();
		
		//Click login button with explicit wait 
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement btnLogin;
		btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
		btnLogin.click();
		
		// 
		String userAdmin= driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals("Welcome Andrei", userAdmin);
		
		//Print a log in message to the screen
		System.out.println("Succefully authetification");

		//Thread.sleep(3000);
  
		//Kill browser
		driver.close();
		driver.quit();



	}

}
