import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {
    public static void main(String[] args) throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setAutomationName("uiAutomator2");
        options.setPlatformName("Android");
        options.setPlatformVersion("16");
        options.setDeviceName("emulator-5554");
        options.setApp("Downloads\\ApiDemos-release.apk");

        //code --> Appium Server-->UiAutomator2-->Emulator

        AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        WebElement prereference = driver.findElement(AppiumBy.accessibilityId("Preference"));
        prereference.click();
        WebElement preferencedependencies= driver.findElement(new AppiumBy.ByAccessibilityId("3. Preference dependencies"));
        preferencedependencies.click();
        WebElement WiFisettings= driver.findElement(new By.ByXPath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]"));
        WiFisettings.click();

    }
}
