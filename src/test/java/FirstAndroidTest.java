import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstAndroidTest {

    private AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        // Configuração das capacidades desejadas (capabilities)
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/apps/ApiDemos-debug.apk"); // Caminho para o APK

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
    }

    @Test
    public void click_App_Button() {
        WebElement appButton = driver.findElementByAccessibilityId("App");
        appButton.click();
    }

    @Test
    public void scroll_test() {
        // Clica na aba "Views"
        WebElement viewsButton = driver.findElementByAccessibilityId("Views");
        viewsButton.click();

        // Realiza a rolagem até encontrar o elemento "Seek Bar"
        driver.findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Seek Bar\"));");

        // Clica no elemento "Seek Bar" após a rolagem
        WebElement seekBar = driver.findElementByAccessibilityId("Seek Bar");
        seekBar.click();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}