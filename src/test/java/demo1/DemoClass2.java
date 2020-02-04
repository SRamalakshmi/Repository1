package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class DemoClass2 {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\mychromedriver\\chromedriver_win32\\chromedriver.exe");
		}
	WebDriver driver=new ChromeDriver();
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
		  WebElement signin=driver.findElement(By.linkText("SignIn"));
		  signin.click();

	    
	}

	@When("User enters valid crendentials and click submit button")
	public void user_enters_valid_crendentials_and_click_submit_button() {
		 WebElement user=driver.findElement(By.name("userName"));
		  user.sendKeys("Lalitha");
		  WebElement pass=driver.findElement(By.name("password"));
		  pass.sendKeys("Password123");
		  WebElement login=driver.findElement(By.name("Login"));
		  login.click();

	   
	}

	@Then("User does successful login")
	public void user_does_successful_login() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");

	    
	}


}
