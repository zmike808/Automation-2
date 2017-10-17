package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailSignUpPage;
import pages.ExplorePage;
import pages.SignInPage;
import pages.SplashScreenPage;
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
		ExplorePage.InitElements();
		Assert.assertTrue(ExplorePage.imageView.isDisplayed());
	}
	
//	//Verify Sign In with profile name (VSCO X)
//	@Test (priority = 1)
//	public static void SignInProfileName() throws InterruptedException {
//		SplashScreenPage.TapSignInBtn();
//		SignInPage.InitElements();
//		SignInPage.TapEmailFieldTxt();
//		AbstractTest.TsullivanX();
//		SignInPage.TapPwdTxt();
//		AbstractTest.Password();
//		Thread.sleep(1000);
//		Assert.assertTrue(SignInPage.signInBtn.isEnabled());
//		SignInPage.TapSignInBtn();
//		ExplorePage.InitElements();
//		Assert.assertTrue(ExplorePage.imageView.isDisplayed());
//	}

}
