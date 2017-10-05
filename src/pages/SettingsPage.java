package pages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import utils.AbstractPage;

public class SettingsPage extends AbstractPage {
	
	//Objects
		//'Close' button (X)
		@FindBy (id="com.vsco.cam:id/settings_close_button")
		public static MobileElement closeBtn;
		
		//'Settings' header text
		@FindBy (id="com.vsco.cam:id/header_text_view")
		public static MobileElement headerText;
				
		//VSCO X 'Membership' button
		@FindBy (id="com.vsco.cam:id/settings_vsco_x_button")
		public static MobileElement xMembershipBtn;
				
		//'About VSCO' button
		@FindBy (id="com.vsco.cam:id/settings_about_button")
		public static MobileElement aboutVSCOBtn;
				
		//'Preferences' button
		@FindBy (id="com.vsco.cam:id/settings_preferences_button")
		public static MobileElement preferenceBtn;
				
		//'Social' button
		@FindBy (id="com.vsco.cam:id/settings_social_button")
		public static MobileElement socialBtn;
				
		//'Privacy' button
		@FindBy (id="com.vsco.cam:id/privacy_button")
		public static MobileElement privacyBtn;
				
		//'Licensing' button
		@FindBy (id="com.vsco.cam:id/settings_licensing_button")
		public static MobileElement licensingBtn;
				
		//'Support' button
		@FindBy (id="com.vsco.cam:id/settings_support_button")
		public static MobileElement supportBtn;
				
		//Version and Build number
		@FindBy (id="settings_version_number")
		public static MobileElement versionNumber;
		
	
	//Methods
		//Tap the Close button
		public static void TapCloseBtn() {
			closeBtn.click();
		}
				
				

}
