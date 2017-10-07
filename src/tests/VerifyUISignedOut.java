package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidKeyCode;
import pages.EmailSignUpPage;
import pages.ExplorePage;
import pages.FacebookAccountKitPage1;
import pages.NavigationBarPage;
import pages.SearchPage;
import pages.SettingsPage;
import pages.ShopPage;
import pages.SignInPage;
import pages.SplashScreenPage;
import pages.StudioPage;
import pages.XUpsellPage;
import utils.AbstractTest;

public class VerifyUISignedOut extends AbstractTest {
	
	//Splash screen
	@Test (priority = 1)
	public static void VerifySplashScreenUI() {
		Assert.assertTrue(SplashScreenPage.closeBtn.isDisplayed());
		Assert.assertTrue(SplashScreenPage.descText.isDisplayed());
		Assert.assertTrue(SplashScreenPage.splashText.isDisplayed());
		Assert.assertTrue(SplashScreenPage.emailSignUpBtn.isDisplayed());
		Assert.assertTrue(SplashScreenPage.phoneSignUpBtn.isDisplayed());
		Assert.assertTrue(SplashScreenPage.signInText.isDisplayed());
	}
	
	//Email Sign Up screen
	@Test (priority = 2)
	public static void VerifyEmailSignUpUI() throws InterruptedException {
		SplashScreenPage.tapEmailSignUpBtn();
		Assert.assertTrue(EmailSignUpPage.backBtn.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.title.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.emailField.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.usernameField.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.passwordField.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.agreeToTermsText.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.signUpBtn.isDisplayed());
		EmailSignUpPage.tapBackBtn();
		
	}
	
	//Phone Sign Up screen (FacebookAccountKitPage1)
	@Test (priority = 3)
	public static void VerifyPhoneSignUpUI() throws InterruptedException {
		SplashScreenPage.tapPhoneSignUpBtn();
		Assert.assertTrue(FacebookAccountKitPage1.enterYourPhoneText.isDisplayed());
		Assert.assertTrue(FacebookAccountKitPage1.phoneNumberField.isDisplayed());
		Assert.assertTrue(FacebookAccountKitPage1.countryCodeBtn.isDisplayed());
		Assert.assertTrue(FacebookAccountKitPage1.descriptiveText.isDisplayed());
		Assert.assertTrue(FacebookAccountKitPage1.nextBtn.isDisplayed());
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(1000);
	}
	
	//Sign In screen
	@Test (priority = 4)
	public static void VerifySignInUI() throws InterruptedException {
		SplashScreenPage.tapSignInBtn();
		//Email tab tests
		Assert.assertTrue(SignInPage.backBtn.isDisplayed());
		Assert.assertTrue(SignInPage.headerText.isDisplayed());
		Assert.assertTrue(SignInPage.emailTabBtn.isDisplayed());
		Assert.assertTrue(SignInPage.phoneTabBtn.isDisplayed());
		Assert.assertTrue(SignInPage.emailFieldText.isDisplayed());
		Assert.assertTrue(SignInPage.passwordFieldText.isDisplayed());
		Assert.assertTrue(SignInPage.fgtPasswordBtn.isDisplayed());
		Assert.assertTrue(SignInPage.phoneTabBtn.isDisplayed());
		Assert.assertTrue(SignInPage.signInBtn.isDisplayed());
		Assert.assertTrue(SignInPage.termsAndPolicyText.isDisplayed());
		//Phone tab tests
		SignInPage.phoneTabBtn.click();
		Assert.assertTrue(SignInPage.countryCodeBtn.isDisplayed());
		Assert.assertTrue(SignInPage.phoneNumberFieldText.isDisplayed());
		Assert.assertTrue(SignInPage.passwordFieldText.isDisplayed());
		Assert.assertTrue(SignInPage.fgtPasswordBtn.isDisplayed());
		Assert.assertTrue(SignInPage.emailTabBtn.isDisplayed());
		Assert.assertTrue(SignInPage.signInBtn.isDisplayed());
		Assert.assertTrue(SignInPage.termsAndPolicyText.isDisplayed());
		SignInPage.tapBackBtn();
	}
	
	//VSCO X Upsell screen
	@Test (priority = 5)
	public static void VerifyXUpsellUI() throws InterruptedException {
		SplashScreenPage.tapCloseBtn();
		Assert.assertTrue(XUpsellPage.closeBtn.isDisplayed());
		Assert.assertTrue(XUpsellPage.skipBtn.isDisplayed());
		Assert.assertTrue(XUpsellPage.xUpsellTitleText.isDisplayed());
		Assert.assertTrue(XUpsellPage.xUpsellSubTitleText.isDisplayed());
		Assert.assertTrue(XUpsellPage.learnMoreBtn.isDisplayed());
		Assert.assertTrue(XUpsellPage.startXTrialBtn.isDisplayed());
	}
	
	//Explore screen
	@Test (priority = 6)
	public static void VerifyExploreUI() throws InterruptedException {
		XUpsellPage.TapSkipBtn();
		Assert.assertTrue(ExplorePage.searchBtn.isDisplayed());
		Assert.assertTrue(ExplorePage.settingsBtn.isDisplayed());
		Assert.assertTrue(ExplorePage.fmfCardText.isDisplayed());
		Assert.assertTrue(ExplorePage.imageView.isDisplayed());
	}
	
	//Search screen
	@Test (priority = 7)
	public static void VerifySearchUI() throws InterruptedException {
		ExplorePage.tapSearchBtn();
		Assert.assertTrue(SearchPage.closeBtn.isDisplayed());
		Assert.assertTrue(SearchPage.searchField.isDisplayed());
		Assert.assertTrue(SearchPage.suggestedUserBookStackView.isDisplayed());
		Assert.assertTrue(SearchPage.suggestedUserUsername.isDisplayed());
		Assert.assertTrue(SearchPage.suggestedUserTitle.isDisplayed());
		Assert.assertTrue(SearchPage.suggestedUserDisplayLabel.isDisplayed());
		Assert.assertTrue(SearchPage.suggestedUserFollowBtn.isDisplayed());
		SearchPage.tapCloseBtn();
	}
	
	//Settings screen
	@Test (priority = 8)
	public static void VerifySettingsUI() throws InterruptedException {
		ExplorePage.tapSettingsBtn();
		Assert.assertTrue(SettingsPage.closeBtn.isDisplayed());
		Assert.assertTrue(SettingsPage.headerText.isDisplayed());
		Assert.assertTrue(SettingsPage.xMembershipBtn.isDisplayed());
		Assert.assertTrue(SettingsPage.aboutVSCOBtn.isDisplayed());
		Assert.assertTrue(SettingsPage.preferenceBtn.isDisplayed());
		Assert.assertTrue(SettingsPage.socialBtn.isDisplayed());
		Assert.assertTrue(SettingsPage.privacyBtn.isDisplayed());
		Assert.assertTrue(SettingsPage.licensingBtn.isDisplayed());
		Assert.assertTrue(SettingsPage.supportBtn.isDisplayed());
		Assert.assertTrue(SettingsPage.versionNumber.isDisplayed());
		SettingsPage.TapCloseBtn();
	}
	
	//Studio screen
	@Test (priority = 9)
	public static void VerifyStudioUI() throws InterruptedException {
		NavigationBarPage.TapStudioNavBtn();
		Assert.assertTrue(StudioPage.cameraPreview.isDisplayed());
		Assert.assertTrue(StudioPage.shopBtn.isDisplayed());
		Assert.assertTrue(StudioPage.studioFilterBtn.isDisplayed());
		Assert.assertTrue(StudioPage.importBtn.isDisplayed());
		Assert.assertTrue(StudioPage.zeroDataText.isDisplayed());
	}
	
	//Shop screen
	@Test (priority = 10)
	public static void VerifyShopUI() throws InterruptedException {
		StudioPage.TapShopBtn();
		Assert.assertTrue(ShopPage.closeBtn.isDisplayed());
		Assert.assertTrue(ShopPage.presetImageView.isDisplayed());
		Assert.assertTrue(ShopPage.storeProductItem.isDisplayed());
		//Assert.assertTrue(ShopPage.introducingVSCOXText.isDisplayed());
		//Assert.assertTrue(ShopPage.vscoXDescriptiveText.isDisplayed());
		ShopPage.TapCloseBtn();
	}
}
