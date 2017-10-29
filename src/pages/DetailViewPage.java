package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class DetailViewPage extends AbstractPage {
	
	//Objects
	//Detail View container
	@FindBy (id="detail")
	public static MobileElement detailView;
	
	//Close button
	@FindBy (id="x_button")
	public static MobileElement closeBtn;
	
	//More button
	@FindBy (id="options_button")
	public static MobileElement moreBtn;
	
	//Image View
	@FindBy (id="vsco_image_view_image")
	public static MobileElement imageView;

	//Favorite button
	@FindBy (id="detail_view_favorite_button")
	public static MobileElement favoriteBtn;
	
	//Republish button
	@FindBy (id="detail_view_republish_button")
	public static MobileElement republishBtn;
	
	//Username
	@FindBy (id="grid_name")
	public static MobileElement username;
	
	//Description
	@FindBy (id="description")
	public static MobileElement description;
	
	//Capture date
	@FindBy (id="date")
	public static MobileElement captureDate;
	
	//Applied preset
	@FindBy (id="filter")
	public static MobileElement appliedPreset;
	
	
	//Methods
	//Tap Close button
	public static void TapCloseBtn() {
		closeBtn.click();
	}
	
	//Tap More button
	public static void TapMoreBtn() {
		moreBtn.click();
	}
	
	//Tap Favorite button
	public static void TapFavoriteBtn() {
		favoriteBtn.click();
	}
	
	//Tap Republish button
	public static void TapRepublishBtn() {
		republishBtn.click();
	}
	
	//Tap Username
	public static void TapUsername() {
		username.click();
	}
	
	//Tap Applied Preset
	public static void TapAppliedPreset() {
		appliedPreset.click();
	}
	
	//Initialize User Profile Page Elements
	public static void InitElements() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), new DetailViewPage());
	}
}
