package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class PrivateProfilePage extends AbstractPage {
	
	public static void InitElements() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), new PrivateProfilePage());
	}
}
