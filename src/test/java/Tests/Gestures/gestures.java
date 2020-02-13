package Tests.Gestures;

import Tests.base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class gestures extends base {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = capabilities("real");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
        //Tap
        TouchAction touch = new TouchAction(driver);
        WebElement expandList = driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
        touch.tap(tapOptions().withElement(element(expandList))).perform(); //TouchAction methods should end with perform()

        WebElement customAdapter = driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']"));
        touch.tap(tapOptions().withElement(element(customAdapter))).perform();

        WebElement namesPeople = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        touch.longPress(longPressOptions().withElement(element(namesPeople)).withDuration(ofSeconds(2))).release().perform();
        Thread.sleep(2000);
        System.out.println(driver.findElementById("android:id/title").isDisplayed());
    }
}