package Tests;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class base {

    public static void main (String[] args){


        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2_API_28");
        cap.setCapability(MobileCapabilityType.APP, );
    }
}
