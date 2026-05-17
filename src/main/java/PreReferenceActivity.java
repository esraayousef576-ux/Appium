import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PreReferenceActivity {
    AndroidDriver driver;
    public final By All_PreRefrenceElements= AppiumBy.xpath("//android.widget.TextView[@text=\"API Demos\"]");

    public PreReferenceActivity(AndroidDriver driver);
    {
        this.driver=driver;
    }


    public void ClickOnAnyElementInPreReferenceActivity(int index) {
    }
}
