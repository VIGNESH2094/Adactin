package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(tags = "@Explore",features ="src\\test\\resources\\Features",glue="StepDefinition")
public class Runner {

}
