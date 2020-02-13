package Tests.Gestures;

import Tests.PackageActivityBase;
import Tests.base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class swipe extends base {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = capabilities("real");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        //driver.findElement(By.xpath("//tagname[@attribute=value]"))  xpath scheme
        driver.findElement(By.xpath("//*[@content-desc=9]")).click();


        //longpress on element for 2 secs
        TouchAction touch = new TouchAction(driver);
        WebElement fromTime = driver.findElement(By.xpath("//*[@content-desc=15]"));
        WebElement toTime = driver.findElement(By.xpath("//*[@content-desc=45]"));
        touch.longPress(longPressOptions().withElement(element(fromTime)).withDuration(ofSeconds(2))).moveTo(element(toTime)).release().perform();
    }
}