package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class NavigationBarPage extends AbstractPage {
	
	//Objects
		//'Explore' button 
		@FindBy (id="left_stack_icon")
		public static MobileElement exploreNavBtn;
			
		//'Studio' button 
		@FindBy (id="center_stack_icon")
		public static MobileElement studioNavBtn;
			
		//'Profile' button 
		@FindBy (id="right_stack_icon")
		public static MobileElement profileNavBtn;
		
		
	//Methods
		//Tap the Explore Navigation Bar button
		public static void TapExploreNavBtn() {
			exploreNavBtn.click();
			PageFactory.initElements(new AppiumFieldDecorator(driver), new ExplorePage());
		}
			
		//Tap the Studio Navigation Bar button
		public static void TapStudioNavBtn() {
			studioNavBtn.click();
			PageFactory.initElements(new AppiumFieldDecorator(driver), new StudioPage());
		}
		
		//Tap the Profile Navigation Bar button
		public static void TapProfileNavBtn() {
			profileNavBtn.click();
			PageFactory.initElements(new AppiumFieldDecorator(driver), new PrivateProfilePage());
		}

}
