package tek.bdd.steps;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import tek.bdd.utility.SeleniumUtilities;

public class HooksSteps extends SeleniumUtilities {


    @Before
    public void beforeEachScenario() {
        setupBrowser();
    }

    @After
    public void afterEachScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenShot = takeScreenShot();
            scenario.attach((screenShot,"image/jpg", "failed_Scenario");
        }
            quitBrowser();
    }
}
