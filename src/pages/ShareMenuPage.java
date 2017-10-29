package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class ShareMenuPage extends AbstractPage {
	//Objects
	//Close button
	@FindBy (id="share_menu_back_icon")
	public static MobileElement closeBtn;
	
	//Share button
	@FindBy (id="image_menu_share")
	public static MobileElement shareBtn;
	
	//Report Image button
	@FindBy (id="image_menu_report_image")
	public static MobileElement reportImageBtn;
		
	//Share menu - Copy Image URL button
	@FindBy (id="share_menu_copy_image_url")
	public static MobileElement copyImageURLBtn;
	
	//Share menu - Email button
	@FindBy (id="share_menu_email")
	public static MobileElement emailBtn;
	
	//Share menu - More button
	@FindBy (id="share_menu_more")
	public static MobileElement moreBtn;
	
	@FindBy (id="share_menu_copy_image_url")
	public static MobileElement copyImageURL;
	
	//Methods 
	
	//Initialize User Profile Page Elements
	public static void InitElements() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), new DetailViewPage());
	}

}
