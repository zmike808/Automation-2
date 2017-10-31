package utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import pages.SplashScreenPage;

public class AbstractTest {

  public static AndroidDriver<MobileElement> driver;

  @BeforeSuite
  public void setup() throws MalformedURLException, InterruptedException {
    File appDir = new File("src");
    File app = new File(appDir, "vsco.apk");
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
    cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
    cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    cap.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.vsco.*");
    cap.setCapability("autoGrantPermissions", "true");

    try {
      driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    PageFactory.initElements(new AppiumFieldDecorator(driver), new SplashScreenPage());
  }

  @AfterSuite
  public void teardown() {
    driver.quit();
  }

  // "tsullivanx' profile name
  public static void TsullivanX() {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_T);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_S);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_U);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_L);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_L);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_I);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_V);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_N);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_X);
  }

  // 'visualsupply' password
  public static void Password() {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_V);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_I);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_S);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_U);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_L);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_S);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_U);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_P);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_P);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_L);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_Y);
  }

  // Email for Email Sign Up (need to change every run until better method is implemented)
  public static void Email() {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_T);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_S);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_U);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_L);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_L);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_I);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_V);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_N);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_PLUS);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_U);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_T);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_O);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_1);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_2);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_7);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_AT);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_S);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_H);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_S);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_T);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_Q);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_PERIOD);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_C);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_O);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_M);
  }

  public static void ProfileName() {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_T);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_S);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_U);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_L);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_L);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_I);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_V);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_N);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_U);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_T);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_O);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_1);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_2);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_7);
  }

  // "Cat" search term
  public static void SearchTerm() {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_C);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_T);
  }

  // Scroll down
  public static void ScrollDown() {
    // duration between scroll start and scroll stop
    Duration Duration = java.time.Duration.ofMillis(100);
    // get window size and coordinates
    Dimension size = driver.manage().window().getSize();
    int startx = (int) (size.width * 0.50);
    int starty = (int) (size.height * 0.50);
    int endy = (int) (size.height * -0.10);
    TouchAction touchAction = new TouchAction(driver);;
    // start scroll
    touchAction.press(startx, starty).moveTo(0, endy).release().perform();
    // stop scroll
    touchAction.waitAction(Duration).press(startx, starty).release().perform();
  }

  // Scroll down to element
  public static void ScrollDownToElement(MobileElement element) {
    for (int i = 1; i <= 15; i++) {
      try {
        element.click();
        System.out.println(element + " found! Tap away!");
        break;
      } catch (NoSuchElementException e) {
        System.out.println(element + " not found, scrolling down");
      }
      AbstractTest.ScrollDown();
    }
  }

  // Accept dialog
  @SuppressWarnings("unused")
  public static void AcceptDialog(MobileElement element) {
    for (int i = 1; i <= 10; i++) {
      try {
        element.click();
        break;
      } catch (NoSuchElementException e) {
        break;
      }

    }

  }
}

