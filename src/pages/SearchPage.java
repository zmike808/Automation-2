package pages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import utils.AbstractPage;

public class SearchPage extends AbstractPage {
	
	//Objects
		//'Close' button (X0
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
		public static MobileElement suggestedUserBookStackView;
		
		//Suggested User Follow button
		@FindBy (id="suggested_users_item_follow_button")
		public static MobileElement suggestedUserFollowBtn;
		
	//Methods
		public static void tapCloseBtn() {
			closeBtn.click();
		}
	
		


}
