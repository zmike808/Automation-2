package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailSignUpPage;
import pages.ExplorePage;
import pages.FindMyFriendsPage;
import pages.NavigationBarPage;
import pages.PrivateProfilePage;
import pages.SettingsPage;
import pages.SignInPage;
import pages.SplashScreenPage;
import pages.VerifyEmailPage;
import pages.XUpsellPage;
import utils.AbstractTest;

public class SanityTest extends AbstractTest {
	
	//Verify Email Sign Up
	@Test (priority = 0)
	public static void EmailSignUp() throws InterruptedException {
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
		Assert.assertTrue(ExplorePage.imageView.isDisplayed());
	}
	
	//Verify Signing out of VSCO
	@Test (priority = 1)
	public static void SignOut() {
		NavigationBarPage.InitElements();
		NavigationBarPage.TapProfileNavBtn();
		PrivateProfilePage.InitElements();
		PrivateProfilePage.TapSettingsBtn();
		SettingsPage.InitElements();
		SettingsPage.TapSignOutBtn();
		Assert.assertTrue(ExplorePage.imageView.isDisplayed());
		NavigationBarPage.TapProfileNavBtn();
		Assert.assertTrue(SplashScreenPage.splashText.isDisplayed());
	}
	
	//Verify Sign In with profile name (VSCO X)
	@Test (priority = 2)
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
		//ExplorePage.InitElements();
		Assert.assertTrue(ExplorePage.imageView.isDisplayed());
	}
	
	

}
