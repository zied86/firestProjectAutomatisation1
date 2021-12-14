package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolTypDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");

		//Open chrome
		WebDriver driver = new ChromeDriver();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//Open URL orangeHRM
		driver.get("https://demoqa.com/tool-tips/ ");

		//Maximize window
		driver.manage().window().maximize();

		WebElement textTooltype = driver.findElement(By.id("toolTipButton"));
		String text = textTooltype.getText();

		if(text.equalsIgnoreCase("Hover me to seE")) {

			System.out.println("Pass: toolType matching expected value");
		}
		else {
			System.out.println("Failed:toolTyp not matching expected value ");
		}

		//placeHolder
		WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));
		String messagePlaceHolder =placeHolder.getAttribute("placeholder");
		System.out.println("The place holder is: "+messagePlaceHolder);



	}

}
