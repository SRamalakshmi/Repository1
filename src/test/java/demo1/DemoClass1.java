package demo1;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class DemoClass1 {

			// TODO Auto-generated method stub
			@Given("i have some cakes in my place")
			public void i_have_some_cakes_in_my_place() {
				System.out.println("I have some cakes in my place");
			}

			@When("i ask my team to collect it")
			public void i_ask_my_team_to_collect_it() {
			    
				System.out.println("I ask my team to collect it");
			}

			@Then("my cakes disappear")
			public void my_cakes_disappear() {
			  
				System.out.println("My cakes disappear");
			}


		}





