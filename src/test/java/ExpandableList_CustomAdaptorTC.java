import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeMethod;

public class ExpandableList_CustomAdaptorTC {
    AndroidDriver driver;
    HomeActivity MyhomeActivity;
    ViewsActivity MyViews;
    ExpandableList_CustomAdaptor customAdaptor;



    @BeforeMethod
    public void PreCondition_BeforeCustomAdaptor()
    {
        MyhomeActivity=new HomeActivity(driver);
        MyhomeActivity.ClickOnHomePageElement(11);
        MyViews=new ViewsActivity(driver);
        MyViews.ClickOnAnyElementOnViewsPage

    }
}
