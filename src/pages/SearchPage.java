package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class SearchPage extends AbstractPage {
	
	//Objects
		//'Close' button (X)
		@FindBy (id="search_close_button")
		public static MobileElement closeBtn;
		
		//Search Field
		@FindBy (id="grid_search_box")
		public static MobileElement searchField;

		//Suggested user Username
		@FindBy (id="suggested_users_item_grid_username")
		public static MobileElement suggestedUserUsername;
		
		//Suggested user Title
		@FindBy (id="suggested_users_item_grid_fullname")
		public static MobileElement suggestedUserTitle;
		
		//Suggested user display label
		@FindBy (id="suggested_users_item_grid_display_label")
		public static MobileElement suggestedUserDisplayLabel;

		//Suggested user bookstack view
		@FindBy (id="suggested_users_bookstack_view")
		public static MobileElement suggestedUserBookstackView;
		
		//Suggested User Follow button
		@FindBy (id="suggested_users_item_follow_button")
		public static MobileElement suggestedUserFollowBtn;
		
	//Methods
		//Tap Close button
		public static void TapCloseBtn() {
			closeBtn.click();
		}
		
		//Tap Search Field
		public static void TapSearchField() {
			searchField.click();
		}
		
		//Tap Suggested user Username
		public static void TapSugUsername() {
			suggestedUserUsername.click();
		}
		
		//Tap Suggested User Images
		public static void TapSugUserImages() {
			suggestedUserBookstackView.click();
		}
		
		//Tap Suggested User Follow button
		public static void TapSugUserFollowBtn() {
			suggestedUserFollowBtn.click();
		}
		
		
		public static void InitElements() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), new SearchPage());
		}
	
		


}
