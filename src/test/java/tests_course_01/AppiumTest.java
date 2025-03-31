package tests_course_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;

public class AppiumTest {
    public static void main(String[] args) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("app", "C:/Users/Notebook-Lenovo S145/Desktop/Vem Ser/APPIUM/apks/chronometer-1-5c.ap");

        WebDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }
}
