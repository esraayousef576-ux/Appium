import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PreRef_Dependencies {
    AndroidDriver driver;
    public final By CheckBox = AppiumBy.id("android:id/checkbox");
    public final By Wifi_Settings = AppiumBy.ByAndroidUIAutomator("new UiSelector().class");
    public final By TextField = AppiumBy.id("android:id/edit");
    public final By Ok_Button = AppiumBy.id("android:id/button1");

    public PreRef_Dependencies(AndroidDriver driver) {

        this.driver=driver;

    }
    public void ClickOnCheckBox()
    {
        driver.findElement(CheckBox).click();

    }
    public void ClickOnWifiSettings()
    {
        driver.findElement(Wifi_Settings).click();
    }
    public void Enter_TextInTextField(String enteredText)
    {
        driver.findElement(TextField).sendKeys(enteredText);
    }
    public void ClickOnOkButton()
    {
        driver.findElement(Ok_Button).click();
    }


}
