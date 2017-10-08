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
		
		//Image View 
		@FindBy (id="vsco_image_view_image")
		public static MobileElement imageView;
		
		
	//Methods
		//Tap the Search button
		public static void tapSearchBtn() {
			ExplorePage.searchBtn.click();
		}
		
		//Tap the Settings button
		public static void tapSettingsBtn() {
			ExplorePage.settingsBtn.click();
		}
		
		//Tap FMF card
		public static void TapFMFCard() {
			fmfCardText.click();
		}
		
		//Tap image view
		public static void  TapImageView () {
			imageView.click();
		}
		
		//Initialize Sign In Page Elements
		public static void InitElements() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), new ExplorePage());
		}
		
		//Tap Image View (TODO)

}
