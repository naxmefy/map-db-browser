package me.nax.mapdbbrowser.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  monochrome = true,
  //tags = "@tags",
  features = "src/test/resources/me/nax/mapdbbrowser/features/",
  format = { "pretty","html: cucumber-html-reports",
             "json: cucumber-html-reports/cucumber.json" },
  dryRun = false,
  glue = "me.nax.mapdbbrowser.cucumber"
)
public class RunCukesTest
{

}
