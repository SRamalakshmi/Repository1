package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoClass3 {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\mychromedriver\\chromedriver_win32\\chromedriver.exe");
		}
	WebDriver driver=new ChromeDriver();
	@Given("enduser is on the login page")
	public void enduser_is_on_the_login_page() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		  driver.manage().window().maximize();
		 
	   }

	@When("enduser enters the valid credentials and click on submit button")
	public void enduser_enters_the_valid_credentials_and_click_on_submit_button() {
		 WebElement user=driver.findElement(By.name("userName"));
		  user.sendKeys("Lalitha");
		  WebElement pass=driver.findElement(By.name("password"));
		  pass.sendKeys("Password123");
		  WebElement login=driver.findElement(By.name("Login"));
		  login.click();   
	}

	@Then("user does successfull login")
	public void user_does_successfull_login() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("enduser enters the invalid credentials and click on submit button")
	public void enduser_enters_the_invalid_credentials_and_click_on_submit_button() {
		WebElement user=driver.findElement(By.name("userName"));
		user.sendKeys("Llitha1");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("llll");
		WebElement login=driver.findElement(By.name("Login"));
		  login.click(); 
	}

	@Then("user gets error page")
	public void user_gets_error_page() {
		//driver.get("http://10.232.237.143:443/TestMeApp/loginhere.htm");
	    System.out.println("Error");
	}

}
