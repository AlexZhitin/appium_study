package Tests.Gestures;

import Tests.base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class dragDrop extends base {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
        driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"))");

        TouchAction touch = new TouchAction(driver);
        WebElement objectOne = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
        WebElement objectTwo = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
        touch.longPress(element(objectOne)).moveTo(element(objectTwo)).release().perform(); //if no duration can be like this
    }
}
