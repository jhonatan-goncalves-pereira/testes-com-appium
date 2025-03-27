import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Sending_Photos_Android_Test {

    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("appPackage", "com.google.android.apps.photos");
        capabilities.setCapability("appActivity", ".home.HomeActivity");

        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    @Test
    public void send_Photo() {

    }

    @AfterTest
    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }
}