package tek.bdd.utility;

import org.openqa.selenium.By;
import tek.bdd.Base.BaseSetupJava;

public class SeleniumUtilities extends BaseSetupJava {


    public void clickOnElement(By locator){
        getDriver().findElement(locator).click();
    }
}
