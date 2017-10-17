package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class FindMyFriendsPage extends AbstractPage {
	
	@FindBy (id = "com.vsco.cam:id/find_my_friends_header_text")
	public static MobileElement headerTxt;
	
	@FindBy (id = "com.vsco.cam:id/find_my_friends_twitter_button")
	public static MobileElement addFromTwitterBtn;
	
	@FindBy (id = "com.vsco.cam:id/find_my_friends_contacts_button")
	public static MobileElement addFromContactsBtn;
	
	@FindBy (id = "com.vsco.cam:id/find_my_friends_skip_button")
	public static MobileElement skipBtn;
	
	//Suggested Users
	@FindBy (id = "com.vsco.cam:id/header_right_button")
	public static MobileElement nextBtn;
	
	
	public static void TapSkipBtn() {
		skipBtn.click();
	}
	
	//suggested user next button
	public static void TapSugNextBtn() {
		nextBtn.click();
	}
	
	public static void InitElements() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), new FindMyFriendsPage());
	}

}
