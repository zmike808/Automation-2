package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class SplashScreenPage extends AbstractPage {
	
	//Objects
	
		///'Close' button (X)
		@FindBy (id="splash_do_it_later_button")
		public static MobileElement closeBtn;
		
		///Splash text
		@FindBy (id="splash_vsco_text")
		public static MobileElement splashText;
		
		///Splash description
		@FindBy (id="splash_vsco_description_text")
		public static MobileElement descText;
		
		///Splash sign in text
		@FindBy (xpath="//android.widget.TextView[@text='Sign in']\")")
		public static MobileElement signInText;
		
		///'Sign up with Email' button
		@FindBy (id="splash_sign_up_button")
		public static MobileElement emailSignUpBtn;
		
		//'Sign up with Phone Number' button
		@FindBy (id="splash_phone_sign_up_button")
		public static MobileElement phoneSignUpBtn;
		
		
		
		
		//Methods
		
		///Tap the 'Email Sign up' button
		public static void tapEmailSignUpBtn() {
			emailSignUpBtn.click();
			PageFactory.initElements(new AppiumFieldDecorator(driver), new EmailSignUpPage());
		}
		
		///Tap the 'Phone Sign up' button
		public static void tapPhoneSignUpBtn() {
			phoneSignUpBtn.click();
			PageFactory.initElements(new AppiumFieldDecorator(driver), new FacebookAccountKitPage1());
		}
		
		///Tap the 'Sign in' button
		public static void tapSignInBtn() {
			signInText.click();
			PageFactory.initElements(new AppiumFieldDecorator(driver), new SignInPage());
		}
		
		///Tap the 'Close' button (X)
		public static void tapCloseBtn() {
			closeBtn.click();
			PageFactory.initElements(new AppiumFieldDecorator(driver), new ExplorePage());
		}
}