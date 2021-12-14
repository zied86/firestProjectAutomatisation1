package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");

		//Open chrome
		WebDriver driver = new ChromeDriver();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//Open URL orangeHRM
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);

		//Maximize window
		driver.manage().window().maximize();

		String titlePage = driver.getTitle();
		int titlelength = titlePage.length();
		System.out.println("Title of the page is:"+titlePage);

		System.out.println(" Lenght title of the page is:"+titlelength);

		String actuelUrl = driver.getCurrentUrl();

		if (actuelUrl.equals(url)) {

			System.out.println("Verification successfull - The correct url is opned ");
		}
		else {

			System.out.println(" Verification failed- An incorrect URL is opned");
		}

		System.out.println("actuel URL is "+actuelUrl);
		System.out.println("Exepted Url is"+url);
		String pagesource = driver.getPageSource();

		int lenghtPageSource = pagesource.length();
		System.out.println("Lengh of the source page is "+lenghtPageSource);
        
		driver.quit();

	}

}
