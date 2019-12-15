package steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver driver;
	private PageObjects page;
	
	@Before()
	public void startup() throws Exception{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		page = new PageObjects(driver);
		Excelutils.setExcelFile(Config.Path_TestData, "Sheet1");
		
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
	public void enter_username() throws Exception {
	   
//	driver.findElement(By.name("userName")).sendKeys(Config.username);-
		String username = Excelutils.getCellData(1, 1);
		page.username().sendKeys(username);
	}

	@Then("enter password")
	public void enter_password() throws Exception {
	   
//	driver.findElement(By.name("password")).sendKeys(Config.password);
//		
		
		String password = Excelutils.getCellData(1, 2);
		page.password.sendKeys(password);
	}

	@Then("click on login")
	public void click_on_login() throws InterruptedException {

//	driver.findElement(By.name("login")).click();-
//		page.login.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", page.login);
		Thread.sleep(3000);
		
//		 or 
		
//		 actions
		
//		Actions action = new Actions(driver);
//		action.click(page.login).perform();
		
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
	@Then("click on continue")
	public void click_on_continue() {

	page.continue_button.click();
	}

	@Then("get multiple elements size")
	public void get_multiple_elements_size() {
		for (WebElement ele: page.mulele){
		for ( int i=0;  i<=page.mulele.size(); i++){
			ele.click();
		System.out.println("clicked on element sucessfully");
		}
		}
		System.out.println("size of the elements are "+page.mulele.size());
	}
	


}
