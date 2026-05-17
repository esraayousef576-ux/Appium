import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pre_Dependencies_TestCases extends Baseclass{
PreRef_Dependencies Dependencies;
PreReferenceActivity Prereference;
HomeActivity MyHomeActivity;
    @BeforeMethod
    public void PreCondition_BeforeDependencies()
    {
        MyHomeActivity=new HomeActivity(driver);
        MyHomeActivity.ClickOnHomePageElement(9);
        Prereference=new PreReferenceActivity(driver);
        Prereference.ClickOnAnyElementInPreReferenceActivity(2);
        Dependencies=new PreRef_Dependencies(driver);
    }

    @Test
    public void CheckAddingValidWifiName()
    {
        Dependencies.ClickOnCheckBox();
        Dependencies.ClickOnWifiSettings();
        Dependencies.Enter_TextInTextField();
        Dependencies.ClickOnOkButton();
    }

}
