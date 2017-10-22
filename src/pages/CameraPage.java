package pages;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class CameraPage extends AbstractPage {
	
	//Objects
		//Close button
		@FindBy (id = "camera_close_button_wrapper")
		public static MobileElement closeBtn;
		
		@FindBy (id = "camera_capture_button")
		public static MobileElement captureBtn;
		
		@FindBy (id = "camera_library_thumbnail_image")
		public static MobileElement thumbnailImage;
		
		@FindBy (id = "camera_switch_camera_button")
		public static MobileElement switchCameraBtn;
		
		
		
	//Methods
		//Tap Close button
		public static void TapCloseBtn() {
			closeBtn.click();
		}
		//Tap Capture button
		public static void TapCaptureBtn() {
			captureBtn.click();
		}
		
		
		
		//Tap switch camera button() {
		public static void TapSwitchCameraBtn() {
			switchCameraBtn.click();
		}
		
		public static void InitElements() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), new CameraPage());
		}

}
