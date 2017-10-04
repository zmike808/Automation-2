package pages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import utils.AbstractPage;

public class FacebookAccountKitPage1 extends AbstractPage {
	
	//Objects
		///Back button
//		@AndroidFindBy (tagName="Navigate up")
//		public static MobileElement backBtn;
		
		///'Enter your phone number' text
		@FindBy (id="com_accountkit_title")
		public static MobileElement enterYourPhoneText;
			
		///Country code button
		@FindBy (id="country_code")
		public static MobileElement countryCodeBtn;
			
		///Phone number field
		@FindBy (id="com_accountkit_phone_number")
		public static MobileElement phoneNumberField;
			
		///Descriptive text
		@FindBy (id="com_accountkit_text")
		public static MobileElement descriptiveText;
			
		///'Next' button
		@FindBy (id="com_accountkit_next_button")
		public static MobileElement nextBtn;
			
			
			
//			///Methods
//			public static void tapBackBtn() {
//				backBtn.click();
//				PageFactory.initElements(new AppiumFieldDecorator(driver), new OnboardingSplashPage());
//				
//			}

}
