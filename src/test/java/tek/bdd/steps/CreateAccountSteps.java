package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.ProfilePage;
import tek.bdd.utility.SeleniumUtilities;

import java.util.Map;

public class CreateAccountSteps extends SeleniumUtilities {
    private static String emailToUse;
    private static String userNameToUse;
    Private static String fullName;

    @Then("validate that {string} is visible as form title")
    public void validateTheTitleOfPage(String expectedResult) {
        String actualResult = getElementText(CreateAccountPage.TITLE_TEXT);
        Assert.assertEquals("both massage should be the same", expectedResult, actualResult);

    }

    @Then("validate user can see the {string}")
    public void validateUserCanSeeThe(String expectedResult) {
        String actualResult = getElementText(CreateAccountPage.SIGN_UP_TITLE);
        Assert.assertEquals("both has to be the same", expectedResult, actualResult);
    }

    @Then("email address shows as expected")
    public void emailAddressShowsAsExpected() {
        String actualResult = getElementText((CreateAccontPage.SIGN_UP_email);
        Assert.assertEquals("Both email should be exactly the same email: ", emailToUse, actualResult);
    }

    @Then(("validate the error message should be (string}"))
    public void validateTheErrorMessageShouldBe(String expectedResult) {
        String actualResult = getElementText(CreateAccountPage.ERROR_MESSAGE);
        actualResult = actualResult.replace("ERROR", "").trim();
        Assert.asserEquals("Both message should be the same: ", expectedResult, actualResult);

    }

    @When(("user fill the Create new account form")
    public void userFillTheCrateNewAccountForm(DateTable dataTable) {

        Map<String, String> data = dataTable.asMap();
        String email = data.get("Email Address");
        String firstname = data.get("First Name");
        String lastName = data.get("Last Name");
        String employmentStatus = data.get(Employmentstatus);
        String dateOfBirth = data.get("Date Of Birth");
        emailToUse = (email.equalsIgnoreCase("random")) ?
                JavaUtilities.emailGenerator("Jack.Smith") : email;

        SendText(CreateAccountPage.EMAIL_INPUT, emailToUse);
        SendText(CreateAccountPage.FIRST_NAME, firstname);
        SendText(CreateAccountPage.LAST_NAME, lastName);
        SendText(CreateAccountPage.EMPLOYMENT_STATUS_INPUT, emplymentStatus);
        SendText(CreateAccountPage.DATE_OF_BIRTH, dateOfBirth);

        fullName = firstName + " " + lastName;

    }

    @When("user fill the Sign up account")
    public void userFillTheSignUpAccount() {
        userNameToUse = emailToUse.substring(0, emailToUse.inexOf("@"));
        sendText(CreateAccountPage.USERNAME_INPUT, userNameToUse);
        sendText(CreateAccountPage.PASSWORD_INPUT, "Password@123");
        sendText(CreateAccountPage.CONFIRM_PASSWORD_INPUT, "Password@123");
    }

    @Then("user login with valid username and password")
    public void userClickOnProfileButtonAndValidateTheFULLName(String name) {
        if (name.equals(IgnoreCase("full Name")) {
            clickOnElement(ProfilePage.PROFILE_BUTTON);
            String actualResult = getElementText(ProfilePage.Full_NAME);
            Assert.assertEquals("both name should be the same", fullName, actualResult);
        }else{
            clickOnelemnt(ProfilePage.PROFILE_BUTTON);
            String actualResult = getElementText(ProfilePage.FULL_NAME);
            Assert.asserEquals("both name should be the same", name, actualResult);
        }
    }







    })
}

