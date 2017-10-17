package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class PrivateProfilePage extends AbstractPage {
	
	//Objects
		//Username
		@FindBy (id="profile_primary_text")
		public static MobileElement usernameText;
	
	
	
	public static void InitElements() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), new PrivateProfilePage());
	}
}
