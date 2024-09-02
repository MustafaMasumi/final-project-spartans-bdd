package tek.bdd.steps;

import io.cucumber.java.en.When;
import tek.bdd.utility.SeleniumUtilities;

public class AccountSteps extends SeleniumUtilities {

    @When("user change Show per page to {String}")
    public void userChangeShowPerPageTo(String value) {
        selectFromDropDownByValue(AccountPage.RECORD_PER_PAGE_DROPDOWN, value);

    }
}
