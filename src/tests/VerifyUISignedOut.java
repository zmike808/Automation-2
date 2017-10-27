package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidKeyCode;
import pages.ContentPage;
import pages.NavigationBarPage;
import pages.SplashScreenPage;
import pages.XUpsellPage;
import pages.Explore.ExplorePage;
import pages.Explore.SearchPage;
import pages.Onboarding.EmailSignUpPage;
import pages.Onboarding.FacebookAccountKitPage1;
import pages.Onboarding.SignInPage;
import pages.Settings.SettingsPage;
import pages.Studio.ShopPage;
import pages.Studio.StudioPage;
import utils.AbstractTest;

public class VerifyUISignedOut extends AbstractTest {
	
	//Splash screen
	@Test (priority = 1)
	public static void SplashScreenUI() {
		Assert.assertTrue(SplashScreenPage.closeBtn.isDisplayed());
		Assert.assertTrue(SplashScreenPage.descText.isDisplayed());
		Assert.assertTrue(SplashScreenPage.splashText.isDisplayed());
		Assert.assertTrue(SplashScreenPage.emailSignUpBtn.isDisplayed());
		Assert.assertTrue(SplashScreenPage.phoneSignUpBtn.isDisplayed());
		Assert.assertTrue(SplashScreenPage.signInText.isDisplayed());
	}
	
	//Email Sign Up screen
	@Test (priority = 2)
	public static void EmailSignUpUI() throws InterruptedException {
		SplashScreenPage.TapEmailSignUpBtn();
		EmailSignUpPage.InitElements();
		Assert.assertTrue(EmailSignUpPage.backBtn.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.title.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.emailField.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.usernameField.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.passwordField.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.agreeToTermsText.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.signUpBtn.isDisplayed());
		EmailSignUpPage.TapBackBtn();
		
	}
	
	//Phone Sign Up screen (FacebookAccountKitPage1)
	@Test (priority = 3)
	public static void PhoneSignUpUI() throws InterruptedException {
		SplashScreenPage.TapPhoneSignUpBtn();
		FacebookAccountKitPage1.InitElements();
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
	public static void SignInUI() throws InterruptedException {
		SplashScreenPage.TapSignInBtn();
		SignInPage.InitElements();
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
		SignInPage.TapBackBtn();
	}
	
	//VSCO X Upsell screen
	@Test (priority = 5)
	public static void XUpsellUI() throws InterruptedException {
		SplashScreenPage.TapCloseBtn();
		XUpsellPage.InitElements();
		Assert.assertTrue(XUpsellPage.closeBtn.isDisplayed());
		Assert.assertTrue(XUpsellPage.skipBtn.isDisplayed());
		Assert.assertTrue(XUpsellPage.xUpsellTitleText.isDisplayed());
		Assert.assertTrue(XUpsellPage.xUpsellSubTitleText.isDisplayed());
		Assert.assertTrue(XUpsellPage.learnMoreBtn.isDisplayed());
		Assert.assertTrue(XUpsellPage.startXTrialBtn.isDisplayed());
	}
	
	//Explore screen
	@Test (priority = 6)
	public static void ExploreUI() throws InterruptedException {
		XUpsellPage.TapSkipBtn();
		ExplorePage.InitElements();
		Assert.assertTrue(ExplorePage.searchBtn.isDisplayed());
		Assert.assertTrue(ExplorePage.settingsBtn.isDisplayed());
		Assert.assertTrue(ExplorePage.fmfCardText.isDisplayed());
		Assert.assertTrue(ContentPage.imageView.isDisplayed());
	}
	
	//Search screen
	@Test (priority = 7)
	public static void SearchUI() throws InterruptedException {
		ExplorePage.TapSearchBtn();
		SearchPage.InitElements();
		Assert.assertTrue(SearchPage.closeBtn.isDisplayed());
		Assert.assertTrue(SearchPage.searchField.isDisplayed());
		Assert.assertTrue(SearchPage.suggestedUserBookstackView.isDisplayed());
		Assert.assertTrue(SearchPage.suggestedUserUsername.isDisplayed());
		Assert.assertTrue(SearchPage.suggestedUserTitle.isDisplayed());
		Assert.assertTrue(SearchPage.suggestedUserDisplayLabel.isDisplayed());
		Assert.assertTrue(SearchPage.suggestedUserFollowBtn.isDisplayed());
		SearchPage.TapCloseBtn();
	}
	
	//Settings screen
	@Test (priority = 8)
	public static void SettingsUI() throws InterruptedException {
		ExplorePage.TapSettingsBtn();
		SettingsPage.InitElements();
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
	public static void StudioUI() throws InterruptedException {
		NavigationBarPage.InitElements();
		NavigationBarPage.TapStudioNavBtn();
		StudioPage.InitElements();
		Assert.assertTrue(StudioPage.cameraPreview.isDisplayed());
		Assert.assertTrue(StudioPage.shopBtn.isDisplayed());
		Assert.assertTrue(StudioPage.studioFilterBtn.isDisplayed());
		Assert.assertTrue(StudioPage.importBtn.isDisplayed());
		Assert.assertTrue(StudioPage.zeroDataText.isDisplayed());
	}
	
	//Shop screen
	@Test (priority = 10)
	public static void ShopUI() throws InterruptedException {
		StudioPage.TapShopBtn();
		ShopPage.InitElements();
		Assert.assertTrue(ShopPage.closeBtn.isDisplayed());
		Assert.assertTrue(ShopPage.presetImageView.isDisplayed());
		Assert.assertTrue(ShopPage.storeProductItem.isDisplayed());
		//Assert.assertTrue(ShopPage.introducingVSCOXText.isDisplayed());
		//Assert.assertTrue(ShopPage.vscoXDescriptiveText.isDisplayed());
		ShopPage.TapCloseBtn();
	}
}
