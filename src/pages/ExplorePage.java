package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;


public class ExplorePage extends AbstractPage {
	
	//Objects
		//'Search' button 
		@FindBy (id="header_left_button")
		public static MobileElement searchBtn;
		
		//'Settings' button 
		@FindBy (id="header_right_button")
		public static MobileElement settingsBtn;
		
		//'Follow - find your friends to connect' text
		@FindBy (id="onboarding_card_textview")
		public static MobileElement fmfCardText;
		
		
		
		
	//Methods
		//Tap the Search button
		public static void TapSearchBtn() {
			ExplorePage.searchBtn.click();
		}
		
		//Tap the Settings button
		public static void TapSettingsBtn() {
			ExplorePage.settingsBtn.click();
		}
		
		//Tap FMF card
		public static void TapFMFCard() {
			fmfCardText.click();
		}
		
		
		
		//Initialize Explore Page Elements
		public static void InitElements() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), new ExplorePage());
		}
		

}
