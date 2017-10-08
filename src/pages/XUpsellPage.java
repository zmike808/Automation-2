package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class XUpsellPage extends AbstractPage {
	
	//Objects
		//'Close' button (V)
		@FindBy (id="close_button")
		public static MobileElement closeBtn;
		
		//'Skip' button
		@FindBy (id="skip_button")
		public static MobileElement skipBtn;
				
		//'Introducing VSCO X' text
		@FindBy (id="subscription_upsell_title")
		public static MobileElement xUpsellTitleText;
				
		//'All 100+ presets plus exclusive member only presets & tools.	New additions monthly.' text
		@FindBy (id="subscription_upsell_subtitle")
		public static MobileElement xUpsellSubTitleText;
				
		//'Learn more' button
		@FindBy (id="learn_more_button")
		public static MobileElement learnMoreBtn;
				
		//'Start free 7-day trial' button
		@FindBy (id="next_button")
		public static MobileElement startXTrialBtn;
		
	
	//Methods
		//Tap the Skip button
		public static void TapSkipBtn() {
			skipBtn.click();
		}
		
		//Tap the Close button
		public static void TapCloseBtn() {
			closeBtn.click();
		}
		
		// Tap Learn More button
		public static void TapLearnMoreBtn() {
			learnMoreBtn.click();
		}
		
		
		//Tap  Start Free Trial button
		public static void TapFreeTrialBtn() {
			startXTrialBtn.click();
		}
		
		public static void InitElements() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), new XUpsellPage());
		}

}
