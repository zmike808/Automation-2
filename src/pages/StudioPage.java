package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class StudioPage extends AbstractPage {
	
	//Objects
		//Camera Preview 
		@FindBy (id="camera_preview")
		public static MobileElement cameraPreview;
		
		//'Shop' button 
		@FindBy (id="header_left_shop_text")
		public static MobileElement shopBtn;
		
		//'View' header text AKA Studio Filtr button 
		@FindBy (id="studio_header_text")
		public static MobileElement studioFilterBtn;
				
		//'Import' button 
		@FindBy (id="header_right_button")
		public static MobileElement importBtn;
				
		//'Import or capture an image to begin editing' zero data text 
		@FindBy (id="studio_empty_text")
		public static MobileElement zeroDataText;
				
		
	//Methods
		//Tap the Shop button
		public static void TapShopBtn() {
			shopBtn.click();
		}
		
		//Tap the Import button
		public static void TapImportBtn() {
			importBtn.click();
		}
		
		public static void InitElements() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), new StudioPage());
		}
}
