package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.PlanPage;
import tek.bdd.utility.SeleniumUtilities;

import java.lang.ref.SoftReference;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PlanSteps extends SeleniumUtilities {

    @Then("validate {int} rows is available")
    public void validateRowsIsAvailable(int expectedNumberOfRows) {

        List<WebElement> elements = getAllElements(PlanPage.TABlE_ROW_LIST);
        Assert.asserEquals(expectedNumberOfRows, elements.size());
    }

    @Then("validate create date is today date and expire date is one day afer")
    public void validateCreateDateIsTodayDateAndEpireDateIsOneDayAfter() {
        SoftAssert softAssert = new SoftAssert();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        List<WebElement> createDateElements = getAllElements(PlanPage.DATE_CREATE_LIST);
        try {
            for (WebElement:
                 createDateElements) {
                String retrieveDateStr = element.getText();
                LocalDate retrievedDate = LocalDate.parse(retrieveDateStr, dateTimeFormatter);
                LocalDate todayDate = LocalDate.now(ZoneId.of("-05:00"));
                softAssert.assertEquals(retrievedDate, todayDate, "both date should match");
            }

            List<WebElement> expireDateElements = getAllElements(PlanPage.DATE_EXPIRE_LIST);
            for (WebElement expireDateElement : expireDateElements) {
                String retrievedExpireDateStr = expireDateElement.getText();
                LocalDate expectedexpireDate = LocalDate.now(ZoneId.of("-05:00")).plusDays(1);
                softAssert.assertEquals(retrievedExpireDate, expectedexpireDate, "Both date should match");
            }
        } catch (DateTimeException e) {
            throw new RuntimeException("use correct date format: " + e.getMessage());
        }
        softAssert.assertAll();
    }
}

