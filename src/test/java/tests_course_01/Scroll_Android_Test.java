package tests_course_01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Scroll_Android_Test {

    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/ApiDemos.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723"), capabilities);
    }

    @Test
    public void scroll_test() {
        AndroidElement views =
                (AndroidElement) driver.findElementByAccessibilityId("Views");
    }

    @AfterTest
    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }
}