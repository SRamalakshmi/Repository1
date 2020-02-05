package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoClass4 {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\mychromedriver\\chromedriver_win32\\chromedriver.exe");
		}
	WebDriver driver=new ChromeDriver();

@Given("Enduser is on the login page")
public void enduser_is_on_the_login_page() {
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.manage().window().maximize();
	  WebElement signin=driver.findElement(By.linkText("SignIn"));
	  signin.click();

}

@When("Enduser enters {string} and {string} and click on submit button")
public void enduser_enters_and_and_click_on_submit_button(String string, String string2) {
	 WebElement user=driver.findElement(By.name("userName"));
	  user.sendKeys(string);
	  WebElement pass=driver.findElement(By.name("password"));
	  pass.sendKeys(string2);
	  WebElement login=driver.findElement(By.name("Login"));
	  login.click();

    
}

@Then("User does successfull login")
public void user_does_successfull_login() {
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   
}


}
