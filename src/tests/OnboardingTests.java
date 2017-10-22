package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContentPage;
import pages.EmailSignUpPage;
import pages.ExplorePage;
import pages.FindMyFriendsPage;
import pages.NavigationBarPage;
import pages.PrivateProfilePage;
import pages.SignInPage;
import pages.SplashScreenPage;
import pages.VerifyEmailPage;
import pages.XUpsellPage;
import pages.Settings.SettingsPage;
import utils.AbstractTest;

public class OnboardingTests extends AbstractTest {
	
	//Verify Email Sign Up
	@Test
	public static void EmailSignUpFreshInstall() throws InterruptedException {
		SplashScreenPage.TapEmailSignUpBtn();
		EmailSignUpPage.InitElements();
		EmailSignUpPage.TapEmailField();
		AbstractTest.Email();
		EmailSignUpPage.TapUsernameField();
		AbstractTest.ProfileName();
		EmailSignUpPage.TapPasswordField();
		AbstractTest.Password();
		Thread.sleep(1000);
		EmailSignUpPage.TapSignUpBtn();
		XUpsellPage.InitElements();
		XUpsellPage.TapSkipBtn();
		VerifyEmailPage.InitElements();
		Thread.sleep(30000);
		System.out.println("Verify the email within 30 seconds");
		VerifyEmailPage.TapChkVerificationBtn();
		FindMyFriendsPage.InitElements();
		FindMyFriendsPage.TapSkipBtn();
		FindMyFriendsPage.TapSugNextBtn();
		ExplorePage.InitElements();
		ContentPage.InitElements();
		Assert.assertTrue(ContentPage.imageView.isDisplayed());
		NavigationBarPage.InitElements();
	}
	
	//Verify Sign In with profile name (VSCO X)
	@Test
	public static void SignInProfileName() throws InterruptedException {
		SplashScreenPage.TapSignInBtn();
		SignInPage.InitElements();
		SignInPage.TapEmailFieldTxt();
		AbstractTest.TsullivanX();
		SignInPage.TapPwdTxt();
		AbstractTest.Password();
		Thread.sleep(1000);
		Assert.assertTrue(SignInPage.signInBtn.isEnabled());
		SignInPage.TapSignInBtn();
		ExplorePage.InitElements();
		ContentPage.InitElements();
		Assert.assertTrue(ContentPage.imageView.isDisplayed());
		NavigationBarPage.InitElements();
	}	
	
	//Skip onboarding
	@Test
	public static void SkipOnboarding() {
		SplashScreenPage.TapCloseBtn();
		XUpsellPage.InitElements();
		XUpsellPage.TapCloseBtn();
		ExplorePage.InitElements();
		NavigationBarPage.InitElements();
		ContentPage.InitElements();
		Assert.assertTrue(ContentPage.imageView.isDisplayed());
	}

	
	
	
	
}
