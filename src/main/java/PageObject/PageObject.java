package PageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility;

public class PageObject {
	public static WebDriver driver;
	public static Properties prop;

	public PageObject() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:/Programs/ObjectModel/src/main/java/Config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public PageObject(WebDriver driver){
			PageFactory.initElements(driver,this);
		}

	public static void intialization() {
		String browserName = prop.getProperty("browser");
		/*
		 * ChromeOptions option=new ChromeOptions(); option.addArguments(
		 * "Disable notification");
		 */
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:/Programs/YatraApp/src/main/java/com/Yatra/Driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utility.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

}
