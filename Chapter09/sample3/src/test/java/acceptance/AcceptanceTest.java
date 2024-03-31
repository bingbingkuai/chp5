 package acceptance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

jacoco {
    enabled = true
    destinationFile = file("$buildDir/jacoco/acceptanceTest.exec")
}

/** Acceptance Test */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:acceptance")
public class AcceptanceTest { }
