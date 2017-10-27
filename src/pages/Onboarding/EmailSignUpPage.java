package pages.Onboarding;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class EmailSignUpPage extends AbstractPage {
		
	//Objects
		//'Back' button
		@FindBy (id="header_left_button")
		public static MobileElement backBtn;
		
		//Title (returns Null currently 2/22/17 -TS)
		@FindBy (id="header_center_textview")
		public static MobileElement title;
		
		//Email field
		@FindBy (id="sign_up_email")
		public static MobileElement emailField;
		
		//Password field 
		@FindBy (id="sign_up_password")
		public static MobileElement passwordField;
		
		//Password field - Show Password
		@FindBy (id="sign_up_show_password")
		public static MobileElement showPasswordBtn;
		
		//Password field - Strength indicator
		@FindBy (id="sign_up_password_strength_indicator")
		public static MobileElement passStrengthInd;
		
		//Username field
		@FindBy (id="sign_up_username")
		public static MobileElement usernameField;
		
		//Username field - availability icon
		@FindBy (id="sign_up_username_availability")
		public static MobileElement usernameAvailibility;
		
		//Terms & Privacy Policy text 
		@FindBy (id="sign_up_agree_to_terms_text")
		public static MobileElement agreeToTermsText;
		
		//'Sign up' button
		@FindBy (id="sign_up_button")
		public static MobileElement signUpBtn;
		
		
	//Methods
		public static String titleText() {
			return title.getText();
		}
		
		public static void TapBackBtn() {
			backBtn.click();
		}
		
		public static void TapEmailField() {
			emailField.click();
		}
		
		public static void TapPasswordField() {
			passwordField.click();
		}
		
		public static void TapShowPasswordBtn () {
			showPasswordBtn.click();
		}
		
		public static void TapUsernameField() {
			usernameField.click();
		}
		
		public static void TapSignUpBtn() {
			signUpBtn.click();
		}
		
		public static void InitElements() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), new EmailSignUpPage());
		}
	}


