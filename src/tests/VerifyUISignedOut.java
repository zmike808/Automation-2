package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailSignUpPage;
import pages.SplashScreenPage;
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
	
	@Test (priority = 2)
	public static void VerifyEmailSignUpUI() throws InterruptedException {
		SplashScreenPage.tapEmailSignUpBtn();
		Thread.sleep(1000);
		Assert.assertTrue(EmailSignUpPage.backBtn.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.title.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.emailField.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.usernameField.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.passwordField.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.agreeToTermsText.isDisplayed());
		Assert.assertTrue(EmailSignUpPage.signUpBtn.isDisplayed());
		EmailSignUpPage.tapBackBtn();
		Thread.sleep(1000);
	}

}
