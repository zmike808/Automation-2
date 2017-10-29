package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationBarPage;
import pages.Explore.ExplorePage;
import pages.Settings.SettingsPage;
import utils.AbstractTest;

public class SettingsTests extends AbstractTest {

  // Verify main settings screen UI
  @Test
  public static void VerifyUISignedOut() {
    NavigationBarPage.InitElements();
    NavigationBarPage.TapExploreNavBtn();
    ExplorePage.TapSettingsBtn();
    // SettingsPage.InitElements();
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
}
