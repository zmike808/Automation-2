package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class UserProfilePage extends AbstractPage {
	
	//Objects
		@FindBy (id="user_profile_image")
		public static MobileElement userProfileImage;
		
		@FindBy (id="profile_secondary_text")
		public static MobileElement username;
		
		@FindBy (id="header_left_button")
		public static MobileElement closeBtn;

//		@FindBy (id="")
//		public static MobileElement ;
//		
//		@FindBy (id="")
//		public static MobileElement ;
//		
//		@FindBy (id="")
//		public static MobileElement ;
//		
//		@FindBy (id="")
//		public static MobileElement ;
		
		
		//Tap Close button
		public static void TapCloseBtn() {
			closeBtn.click();
		}
		
		
		//Initialize User Profile Page Elements
		public static void InitElements() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), new UserProfilePage());
		}

}
