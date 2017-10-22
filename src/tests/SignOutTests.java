package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.NavigationBarPage;
import pages.PrivateProfilePage;
import pages.SplashScreenPage;
import pages.Settings.SettingsPage;
import utils.AbstractTest;

public class SignOutTests extends AbstractTest {
	
	//Verify Signing out of VSCO
		@Test
		public static void SignOut() {
			NavigationBarPage.TapProfileNavBtn();
			PrivateProfilePage.InitElements();
			PrivateProfilePage.TapSettingsBtn();
			SettingsPage.InitElements();
			SettingsPage.TapSignOutBtn();
			//Assert.assertTrue(ExplorePage.imageView.isDisplayed());
			//NavigationBarPage.TapProfileNavBtn();
			Assert.assertTrue(SplashScreenPage.splashText.isDisplayed());
			SplashScreenPage.TapCloseBtn();
		}	

}
