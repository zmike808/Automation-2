package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractTest;

public class VerifyEmailPage extends AbstractTest {
//Objects
	//Close Button
	@FindBy (id = "com.vsco.cam:id/verify_email_close_button")
	public static MobileElement closeBtn;
	
	//"Please verify your email" text
	@FindBy (id = "com.vsco.cam:id/verify_email_header_text")
	public static MobileElement verifyEmailTxt;
	
	//"Resend verification email" button
	@FindBy (id = "com.vsco.cam:id/verify_email_resend_button")
	public static MobileElement resendEmailBtn;
	
	//"Edit email address" button
	@FindBy (id = "com.vsco.cam:id/verify_email_edit_email_button")
	public static MobileElement editEmailBtn;
	
	//"Check verification" button
	@FindBy (id = "com.vsco.cam:id/verify_email_check_activation_button")
	public static MobileElement checkVerificationBtn;
	
//Methods
	//Tap the Close button
	public static void TapCloseBtn() {
		closeBtn.click();
	}
	
	//Tap the Check verification button
	public static void TapChkVerificationBtn() {
		checkVerificationBtn.click();
	}
	
	//Tap the Resend verification email
	public static void TapResendBtn() {
		resendEmailBtn.click();
	}
	
	
	public static void InitElements() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), new VerifyEmailPage());
	}
}
