package testsCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyColor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://192.168.26.145:96/#/auth/login?redirectUrl=%2Fhome%2Fdashboard");
		driver.manage().window().maximize();
		
		// Get element color
		String color = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/mat-card/form/div[4]/button")).getCssValue("color");
		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(", ");
		
		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		
		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();

		int hexValue3 = Integer.parseInt(hexValue[2]);
		
		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		Assert.assertEquals("#ff0000", actualColor);
		System.out.println("The color of the text is: " +actualColor);
	}
		
		
		

	}


