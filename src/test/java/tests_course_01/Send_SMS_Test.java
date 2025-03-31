package tests_course_01;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Send_SMS_Test {

    public AppiumDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("appPackage",   "com.google.android.apps.messaging");
        capabilities.setCapability("appActivity",   ".ui.ConversationListActivity");

        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    @Test
    public void send_SMS() {
    }

    @AfterTest
    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }
}