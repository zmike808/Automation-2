package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class SettingsPage extends AbstractPage {
	
	//Objects
		//'Close' button (X)
		@FindBy (id="settings_close_button")
		public static MobileElement closeBtn;
		
		//'Settings' header text
		@FindBy (id="header_text_view")
		public static MobileElement headerText;
				
		//VSCO X 'Membership' button
		@FindBy (id="settings_vsco_x_button")
		public static MobileElement xMembershipBtn;
				
		//'About VSCO' button
		@FindBy (id="settings_about_button")
		public static MobileElement aboutVSCOBtn;
				
		//'Preferences' button
		@FindBy (id="settings_preferences_button")
		public static MobileElement preferenceBtn;
				
		//'Social' button
		@FindBy (id="settings_social_button")
		public static MobileElement socialBtn;
				
		//'Privacy' button
		@FindBy (id="privacy_button")
		public static MobileElement privacyBtn;
				
		//'Licensing' button
		@FindBy (id="settings_licensing_button")
		public static MobileElement licensingBtn;
				
		//'Support' button
		@FindBy (id="settings_support_button")
		public static MobileElement supportBtn;
				
		//Version and Build number
		@FindBy (id="settings_version_number")
		public static MobileElement versionNumber;
		
		//'Sign Out' button
		@FindBy (id="settings_sign_out")
		public static MobileElement signOutBtn;
	
	//Methods
		//Tap the Close button
		public static void TapCloseBtn() {
			closeBtn.click();
		}
		
		// Tap VSCO X Membership button
		public static void TapXMembershipBtn() {
			xMembershipBtn.click();
		}
		
		// Tap About VSCO button
		public static void TapAboutVSCOBtn() {
			aboutVSCOBtn.click();
		}
		
		// Tap Preferences button
		public static void TapPreferencesBtn() {
			preferenceBtn.click();
		}
		
		// Tap Social button
		public static void TapSocialBtn() {
			socialBtn.click();
		}
		
		// Tap Privacy button
		public static void TapPrivacyBtn() {
			privacyBtn.click();
		}
		
		// Tap Licensing button
		public static void TapLicensingBtn() {
			licensingBtn.click();
		}
		
		// Tap Support button
		public static void TapSupportBtn() {
			supportBtn.click();
		}
		
		//Tap Sign Out button
		public static void TapSignOutBtn() {
			signOutBtn.click();
		}
		
		
		public static void InitElements() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), new SettingsPage());
		}
				
				

}
