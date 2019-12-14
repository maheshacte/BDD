package steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver driver;
	private PageObjects page;
	
	@Before()
	public void startup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		page = new PageObjects(driver);
		
	}
	
	@After()
	public void quit() throws IOException{
//		File src = ((TakesScreenShot)driver).
		File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(image, new File("D:\\Selenium_mahesh\\images\\mercury.png"));
//		s
		driver.quit();
	}
	
	
	@Given("url is provided")
	public void url_is_provided() {
		
		driver.get(Config.url);
	    
	}

	@Then("enter username")
	public void enter_username() {
	   
//	driver.findElement(By.name("userName")).sendKeys(Config.username);-
		page.username().sendKeys(Config.username);
	}

	@Then("enter password")
	public void enter_password() {
	   
//	driver.findElement(By.name("password")).sendKeys(Config.password);
		page.password.sendKeys(Config.password);
	}

	@Then("click on login")
	public void click_on_login() {

//	driver.findElement(By.name("login")).click();-
		page.login.click();
	}

	@Then("print the title of the page")
	public void print_the_title_of_the_page() {
		String title  = driver.getTitle();
		System.out.println(title);
//		sFile src = ((TakeScreenshot)driver).
		
				
 	
	}

	@Then("get the cookie information")
	public void get_the_cookie_information() {

	System.out.println(driver.manage().getCookies());
	}

	@Then("scroll down")
	public void scroll_down() throws InterruptedException {

	JavascriptExecutor scroll = (JavascriptExecutor)driver;
//	scroll.executeScript("scrollBy(0,250)");
	scroll.executeScript("window.scrollBy(0,200)");
	Thread.sleep(3000);
	scroll.executeScript("scrollBy(0,-250)");
	Thread.sleep(3000);
	}


}
