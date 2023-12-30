package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import pages.UI.AlertUI;

public class AlertObj extends BasePage {
    WebDriver driver;
    public AlertObj(WebDriver driver){this.driver = driver;}
    public void clickSimpleAlert(){clickToElementById(driver, AlertUI.CONFIRM_ALERT_BUTTON);}
    public void clickConfirmAlert(){clickToElementById(driver,AlertUI.CONFIRM_ALERT_BUTTON);}
    public void clickPromptAlert(){clickToElementById(driver,AlertUI.PROMPT_ALERT_BUTTON);}
}
