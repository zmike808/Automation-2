package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class SignInPage extends AbstractPage {
	
	//Objects
		///Header obj (TODO put header objects in separate class to be reused
		//'Back' button
		@FindBy (id="header_left_button")
		public static MobileElement backBtn;
		
		//'Sign in' header text
		@FindBy (id="header_center_textview")
		public static MobileElement headerText;
		
		
		///Email tab obj
		//'EMAIL' tab button
		@FindBy (id="sign_in_tab_email_button")
		public static MobileElement emailTabBtn;
		
		//'Email or Profile name' placeholder text
		@FindBy (id="sign_in_identifier")
		public static MobileElement emailFieldText;
		
		//'Email or Profile name field (may not need if clicking text activates the field)
		@FindBy (id="sign_in_identifier_sliding_view")
		public static MobileElement emailField;

		
		///Phone tab obj
		//'PHONE' tab button
		@FindBy (id="sign_in_tab_phone_button")
		public static MobileElement phoneTabBtn;
		
		//Country code button
		@FindBy (id="sign_in_phone_country_code")
		public static MobileElement countryCodeBtn;
		
		//'Phone number' placeholder text
		@FindBy (id="sign_in_phone_number")
		public static MobileElement phoneNumberFieldText;
		
		
		///Shared objects
		//'Forgot Password' button
		@FindBy (id="sign_in_forgot_password_button")
		public static MobileElement fgtPasswordBtn;
		
		//'Sign in' button
		@FindBy (id="sign_in_button")
		public static MobileElement signInBtn;
		
		//'I accept the Terms & Privacy Policy' text
		@FindBy (id="sign_in_agree_to_terms_text")
		public static MobileElement termsAndPolicyText;
		
		//'Password' placeholder text
		@FindBy (id="sign_in_password")
		public static MobileElement passwordFieldText;
		
		//'Password' field
		@FindBy (id="sign_in_password_sliding_view")
		public static MobileElement passwordField;
		
		
	///Methods
		//Tap the Back button
		public static void TapBackBtn() {
			backBtn.click();
		}
		
		public static void InitElements() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), new SignInPage());
		}

}
