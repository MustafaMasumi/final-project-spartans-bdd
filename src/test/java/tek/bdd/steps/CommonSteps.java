package tek.bdd.steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtilities;

public class CommonSteps extends SeleniumUtilities
    @Given("user click on String link"
    public void userClickonLinks(String linkText) {
        clickonElement(By.linkText(linkText));


}
