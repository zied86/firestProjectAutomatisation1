package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SlectFromDropDownList {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");

		//Open chrome
		WebDriver driver = new ChromeDriver();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//Open URL orangeHRM
		driver.get("https://demoqa.com/select-menu");

		//Maximize window
		driver.manage().window().maximize();
		
		
		Select color = new Select(driver.findElement(By.id("oldSelectMenu")));
		color.selectByIndex(6);
		color.selectByValue("9");
		color.selectByVisibleText("Black");
		
		driver.quit();
		




	}

}
