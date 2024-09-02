package tek.bdd.pages;

import org.openqa.selenium.By;
import tek.bdd.steps.CreateAccountSteps;

public class HomePage extends CreateAccountSteps {
    public static final By CREATE_PRIMARY_ACCOUNT = By.linkText("Create Premary Account");
    public static final By START_PAGE_TITLE = By.xpath("//h2[text() ='Lets get you started']");


}
