package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginTest {

@Given("^I want to write a step with precondition$")
public void i_want_to_write_a_step_with_precondition()  {
    System.out.println("Hello World");
}

@Given("^some other precondition$")
public void some_other_precondition()  {
	 System.out.println("Hello World");
}

@When("^I complete action$")
public void i_complete_action() {
	 System.out.println("Hello World");
}

@When("^some other action$")
public void some_other_action()  {
	 System.out.println("Hello World");
}

@When("^yet another action$")
public void yet_another_action()  {
	 System.out.println("Hello World");
}

@Then("^I validate the outcomes$")
public void i_validate_the_outcomes() {
	 System.out.println("Hello World");
}

@Then("^check more outcomes$")
public void check_more_outcomes() {
	 System.out.println("Hello World");
}


}
