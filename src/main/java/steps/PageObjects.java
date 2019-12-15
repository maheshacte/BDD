package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	WebDriver driver;
	
	public PageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	 page factory model  new
	@FindBy(name = "userName")
	public WebElement username;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(name = "login")
	public WebElement login;
	
	@FindBy(name="findFlights")
	public WebElement continue_button;
	
	@FindBy(xpath="//form[@name='results']/table/tbody/tr[*]/td[1]/input")
	public List<WebElement> mulele;
	
	
//	 page object model  old
	public WebElement username(){
		return driver.findElement(By.name("userName"));
	}
	
	public List<WebElement> mulele(){
	
		return driver.findElements(By.xpath("//form[@name='results']/table/tbody/tr[*]/td[1]/input"));
		
	}
}
