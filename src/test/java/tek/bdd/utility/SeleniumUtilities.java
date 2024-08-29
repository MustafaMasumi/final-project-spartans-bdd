package tek.bdd.utility;

import org.openqa.selenium.By;
import tek.bdd.Base.BaseSetup;

public class SeleniumUtilities extends BaseSetup {


    public void clickOnElement(By locator){
        getDriver().findElement(locator).click();
    }
}
