package utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pages.SplashScreenPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AbstractTest {
	
public static AndroidDriver<MobileElement> driver;
	
@BeforeSuite
public void setup() throws MalformedURLException, InterruptedException {
	File appDir = new File("src");
	File app = new File(appDir, "VSCO-35(1324).apk");
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
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
PageFactory.initElements(new AppiumFieldDecorator(driver), new SplashScreenPage());
}

@AfterSuite
public void teardown() {
	driver.quit();
}

//"tsullivanx' profile name
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

//'visualsupply' password
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

//Email for Email Sign Up (need to change every run until better method is implemented)
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
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_3);
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
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_3);
}
}