package tek.bdd.pages;

import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtilities;

public class PlanPage extends SeleniumUtilities {

    public static final By TABlE_ROW_LIST = By.xpath("//table/tbody/tr");
    public static final By DATE_CREATE_LIST = By.xpath("//table/tbody/tr/td[4]");
    public static final By DATE-EXPIRE-LIST = By.xpath("//table/tbody/tr/td[5]");

}
