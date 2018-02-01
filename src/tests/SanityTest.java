package tests;


import org.testng.annotations.Test;
import utils.AbstractTest;

public class SanityTest extends AbstractTest {

  // Verify Email Sign Up
//  @Test(priority = 0, enabled = false)
//  public static void EmailSignUpFreshInstall() throws InterruptedException {
//    OnboardingTests.EmailSignUpFreshInstall();
//  }

  // Verify Signing out of VSCO
  // @Test (priority = 1, enabled = false)
  // public static void SignOut() {
  // OnboardingTests.SignOut();
  // }

  // Verify Sign In with profile name (VSCO X)
  @Test(priority = 2)
  public static void SignInProfileName() throws InterruptedException {
    OnboardingTests.SignInProfileName();
  }

  // Verify back camera capture
  @Test(priority = 3)
  public static void BackCameraCapture() {
    CameraTests.BackCameraCapture();
  }

  // Verify front camera capture
  @Test(priority = 4)
  public static void FrontCameraCapture() {
    CameraTests.FrontCameraCapture();
  }

  // Verify Signing out of VSCO
  @Test(priority = 5)
  public static void SignOut() {
    SignOutTests.SignOut();
  }

  // Verify settings (Explore)
  @Test(priority = 6)
  public static void VerifySettingsSO() {
    SettingsTests.VerifyUISignedOut();;
  }

  // Verify search (Signed out)
  @Test(priority = 7)
  public static void VerifySearch() {
    SearchTests.PeopleImageJournalSearch();
  }



}
