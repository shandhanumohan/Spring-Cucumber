package com.sample.test.cucumber;

import com.sample.test.cucumber.stepdefs.AbstractStepdef;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
        glue = "com.sample.test", tags = "@MultiplicationTest")
public class RunnerTest {
}
