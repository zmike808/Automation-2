package pages.Studio;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class ShopPage extends AbstractPage {

	//Objects
		//Close button 
		@FindBy (id="store_close_button_wrapper")
		public static MobileElement closeBtn;
		
		//Preset price tag
		@FindBy (id="store_product_item_status")
		public static MobileElement storeProductItem;
				
		//Preset image view
		@FindBy (id="store_product_item_image")
		public static MobileElement presetImageView;
				
		//'Introducing VSCO X' text
//		@FindBy (xpath="//*[@text='" + "Introducing\r\nVSCO X" + "']")
//		public static MobileElement introducingVSCOXText;
//				
//		//'All 100+ presets plus exclusive member-only presets & tools.New additions monthly.' text
//		@FindBy (name="All 100+ presets plus exclusive member-only presets & tools.\r\n" + 
//				"New additions monthly.")
//		public static MobileElement vscoXDescriptiveText;
				
		
	//Methods
		//Tap the Close button
		public static void TapCloseBtn() {
			closeBtn.click();
		}
		
		public static void InitElements() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), new ShopPage());
		}

}
