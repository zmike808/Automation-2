package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class ContentPage extends AbstractPage {
	//Objects
		//Photo view
			@FindBy (id="vsco_image_view_image")
			public static MobileElement imageView;
			
		//Journal Title
			@FindBy (id="article_item_title_textview")
			public static MobileElement journalTitle;
			
			
			
			
			//Tap image view
			public static void  TapImageView () {
				imageView.click();
			}
			
			//Initialize Explore Page Elements
			public static void InitElements() {
				PageFactory.initElements(new AppiumFieldDecorator(driver), new ContentPage());
			}
			
}
