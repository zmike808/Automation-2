package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class SplashScreenPage extends AbstractPage {

  // Objects
  // 'Close' button (X)
  @FindBy(id = "splash_do_it_later_button")
  public static MobileElement closeBtn;

  // Splash text
  @FindBy(id = "splash_vsco_text")
  public static MobileElement splashText;

  // Splash description
  @FindBy(id = "splash_vsco_description_text")
  public static MobileElement descText;

  // Splash sign in text
  @FindBy(id = "splash_sign_in_text")
  public static MobileElement signInText;

  // 'Sign up with Email' button
  @FindBy(id = "splash_sign_up_button")
  public static MobileElement emailSignUpBtn;

  // 'Sign up with Phone Number' button
  @FindBy(id = "splash_phone_sign_up_button")
  public static MobileElement phoneSignUpBtn;

  // Methods
  // Tap the 'Email Sign up' button
  public static void TapEmailSignUpBtn() {
    emailSignUpBtn.click();
  }

  // Tap the 'Phone Sign up' button
  public static void TapPhoneSignUpBtn() {
    phoneSignUpBtn.click();
  }

  // Tap the 'Sign in' button
  public static void TapSignInBtn() {
    TouchAction tapCoordinates = new TouchAction(driver); // where driver is AppiumDriver
    tapCoordinates.tap(967, 2261).perform();
  }

  // Tap the 'Close' button (X)
  public static void TapCloseBtn() {
    closeBtn.click();
  }

  public static void InitElements() {
    PageFactory.initElements(new AppiumFieldDecorator(driver), new SplashScreenPage());
  }
}
