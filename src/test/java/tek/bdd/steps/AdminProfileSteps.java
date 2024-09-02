package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.ProfilePage;
import tek.bdd.utility.SeleniumUtilities;

import static io.cucumber.core.internal.com.fasterxml.jackson.databind.type.LogicalType.Map;

public class AdminProfileSteps extends SeleniumUtilities {
    @Then("user click on profile button")
    public void userClickonProfileButton() {
        clickOnElement(ProfilePage.PROFILE_BUTTON);
    }

    @Then("validate information in Profile side Drawer is correct")
    public void validateProfileSideDrawer(DateTable dataTable) {

        Map < String, data = dataTable.asMap();
        String expectedUserType = data.get("User Type");
        String expectedFullName = data.get("Full Name");
        String expectedUserName = data.get("UserName");
        String expectedAuthorities = data.get("Authorities");
        SoftAssert softAssert = new SoftAssert();
        String actualUserType = getelementText(ProfilePage.USER_TYPE);
        String actualUserType = getElementText(ProfilePage.FULL_NAME);
        String actualUserType = getelementText(ProfilePage.USER_NAME);
        String actualAuthorities = getElementText(ProfilePage.USER_AUTORITIES);

        //Assertion here is done with Testing to check all the seertion

        softAssert.assertEquals("actualUserType, expectedUserType, expectedUserType, Both should be the same");
        softAssert.assertEquals("actualFullName, expectedFullName, expectedFullName, Both should be the same");
        softAssert.assertEquals("actualUserName, expectedUserName, expectedUserName, Both should be the same");
        softAssert.assertEquals("actuaAuthorities, expecteAuthorities, expectedAuthorities, Both should be the same");
        softAssert.assertAll();
    }

    @Then("validate user navigated to home page")
    public void validateUserNavigatedToHomePage() {
        boolean is Displayed = elementIsDisplayed(HomePage.START_PAGE_TITLE);

        Assert.assertTrue(isDisplayed);
    }
}





    }
}
