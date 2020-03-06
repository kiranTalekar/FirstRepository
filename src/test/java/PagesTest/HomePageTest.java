package PagesTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.PageObject;
import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest extends PageObject{
	public HomePage homePage;
	public LoginPage loginPage;
	
	public HomePageTest(){
		super();
	}
	public HomePageTest(WebDriver driver){
		super(driver);
	}
	
	@BeforeMethod
	public void setUp(){
		intialization();
		loginPage=new LoginPage(driver);
		homePage=new HomePage(driver);
		
	}
	@Test(priority=1)
	public void UrlTest(){
		String url = homePage.checkCurrentUrl();
		System.out.println(url);
	}
	
	@Test(priority=2)
	public void titleTest(){
		String title = homePage.checkHomePageTitle();
		System.out.println(title);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
