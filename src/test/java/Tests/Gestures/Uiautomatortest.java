package Tests.Gestures;

import Tests.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Uiautomatortest extends base {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElementByAndroidUIAutomator("attribute(==value)"); identify element with uiautomator
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        //Validate clickable feature for all options

        //driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
        //clickable(true) is a property
        driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());


    }
}
