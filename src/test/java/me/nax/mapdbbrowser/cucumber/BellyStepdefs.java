package me.nax.mapdbbrowser.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import me.nax.mapdbbrowser.Belly;

public class BellyStepdefs
{
  @Given("^I have (\\d+) cukes in my belly$")
  public void I_have_cukes_in_my_belly(int cukes)
    throws Throwable
  {
    Belly belly = new Belly();
    belly.eat(cukes);
  }

  @When("I wait 1 hour")
  public void I_wait_1_hour()
    throws Throwable
  {

  }

  @Then("my belly should growl")
  public void my_belly_should_growl()
  {

  }
}
