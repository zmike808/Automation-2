package pages.Settings;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import utils.AbstractPage;

public class AboutPage extends AbstractPage {
	
	//Objects
		// Title
		@FindBy (id="header_text_view")
		public static MobileElement aboutHeader;
		
		// Close button
		@FindBy (id="close_button")
		public static MobileElement closeBtn;
		
		// Rate and Review button
		@FindBy (id="settings_about_rate")
		public static MobileElement rateReviewBtn;
		
		// Go to vsco.co
		@FindBy (id="settings_about_visit")
		public static MobileElement vscoCOBtn;
		
		// Photo Credits button
		@FindBy (id="settings_about_photo_credits")
		public static MobileElement photoCreditsBtn;
		
		// Community Guidelines button
		@FindBy (id="settings_about_community_guidelines")
		public static MobileElement communityGuidelinesBtn;
		
		// Terms of use button
		@FindBy (id="settings_about_terms")
		public static MobileElement termsOfUseBtn;
		
		// Privacy Policy button
		@FindBy (id="settings_about_privacy_policy")
		public static MobileElement privacyPolicyBtn;
		
		// Instagram button
		@FindBy (id="settings_instagram_button")
		public static MobileElement instagramBtn;
		
		// Twitter button
		@FindBy (id="settings_twitter_button")
		public static MobileElement twitterBtn;
		
		// Facebook button
		@FindBy (id="settings_facebook_button")
		public static MobileElement facebookBtn;
		
		// Google Plus button
		@FindBy (id="settings_gplus_button")
		public static MobileElement googlePlusBtn;

}
