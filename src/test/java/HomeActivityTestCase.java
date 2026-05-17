import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class HomeActivityTestCase extends Baseclass{
HomeActivity MyhomeActivity;

    @Test
    public void ClickONElement(){

        MyhomeActivity=new HomeActivity(driver);
        MyhomeActivity.AllElements(1);
        driver.navigate().back();
        MyhomeActivity.AllElements(2);

    }
}


