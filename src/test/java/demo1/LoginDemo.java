package demo1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class LoginDemo {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\mychromedriver\\chromedriver_win32\\chromedriver.exe");
		}
	WebDriver driver=new ChromeDriver();

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		  driver.manage().window().maximize();
		   //WebElement signin=driver.findElement(By.linkText("SignIn"));
		  //signin.click(); 
		  //driver.manage().window().maximize();
	}

	@When("Given user is on the login pagen  user enters correct credentials")
	public void given_user_is_on_the_login_pagen_user_enters_correct_credentials() {
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		  driver.findElement(By.name("password")).sendKeys("Password123");
		  
		   driver.findElement(By.name("Login")).click();
		 //WebElement user=driver.findElement(By.name("userName"));
		   //user.sendKeys("Lalitha");
		  //WebElement pass=driver.findElement(By.name("password"));
		  //pass.sendKeys("Password123");
		  //WebElement login=driver.findElement(By.name("Login"));
		  //login.click();   
	    
	}

	@Then("user can do the successful login")
	public void user_can_do_the_successful_login() {
		WebElement login=driver.findElement(By.name("Login"));
		login.click();   
        driver.close();
	}
	public class Credentials{
        public String Username;
        public String Password;
    }

	@When("user enters below credentails and clicks sing in")
	public void user_enters_below_credentails_and_clicks_sing_in(List <Credentials> Userdata) {
	//public void user_enters_below_credentails_and_clicks_sing_in(List<Credentials> userdata) {
			
		for(Credentials credentials:Userdata){

		          driver.findElement(By.name("userName")).sendKeys(credentials.Username);
		          driver.findElement(By.name("password")).sendKeys(credentials.Password);
		          driver.findElement(By.name("login")).click();
		          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		         driver.navigate().to("http://10.232.237.143:443/TestMeApp/loginhere.htm");
		         	}
		}

		//WebElement username=driver.findElement(By.name("userName"));
		//username.sendKeys("litha");
	    //WebElement password=driver.findElement(By.name("password"));
		//username.sendKeys("Password1234");
	    //WebElement login=driver.findElement(By.name("Login"));
		//login.click();
	    //driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	

	@Then("the expected behavior could be")
	public void the_expected_behavior_could_be() {
	    System.out.println("end");
	    
	   
	}



}
