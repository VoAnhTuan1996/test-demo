package test;

import core.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import pages.Obj.AlertObj;
import pages.UI.AlertUI;

public class AlertTest extends BaseTest {
    AlertObj objAlert;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "alerts";
        driver.get(url);
        objAlert = new AlertObj(driver);
    }
    @Test
    public void simpleAlertTest() throws InterruptedException {
        objAlert.clickSimpleAlert();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
    }

}
