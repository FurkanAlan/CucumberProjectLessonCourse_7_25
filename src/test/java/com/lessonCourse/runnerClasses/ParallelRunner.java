package com.lessonCourse.runnerClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        , glue = "com/lessonCourse/stepDefinitions"
        , dryRun = false
        , plugin = {"pretty", "html:target/html/cucumber-default", "json:target/cucumber.json", "rerun:target/failed.txt"}
)

public class ParallelRunner {

}
