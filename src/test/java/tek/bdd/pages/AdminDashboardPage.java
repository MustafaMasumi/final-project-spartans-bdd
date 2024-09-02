package tek.bdd.pages;

import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtilities;

public class AdminDashboardPage extends SeleniumUtilities {

    public static final By TITLE_Text = By.xpath("//div[contains(@class,'header')]/a/following-sibling::h2");
}
