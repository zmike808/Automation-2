package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import pages.ContentPage;
import pages.DetailViewPage;
import pages.FavoritesPage;
import pages.JournalPage;
import pages.NavigationBarPage;
import pages.PrivateProfilePage;
import pages.UserProfilePage;
import pages.Explore.ExplorePage;
import utils.AbstractTest;

public class ExploreTests extends AbstractTest {

  // Verify viewing a Journal
  @Test
  public static void ViewJournal() throws InterruptedException {
    ContentPage.InitElements();
    AbstractTest.ScrollDownToElement(ContentPage.journalTitle);
    JournalPage.InitElements();
    Assert.assertTrue(JournalPage.journalTitle.isDisplayed());
    JournalPage.TapCloseBtn();
    Assert.assertTrue(ExplorePage.searchBtn.isDisplayed());
  }

  // Verify viewing a Collection Update
  @Test
  public static void ViewCollectionUpdate() {
    ContentPage.InitElements();
    AbstractTest.ScrollDownToElement(ContentPage.collectionUpdateTitle);
    UserProfilePage.InitElements();
    Assert.assertTrue(UserProfilePage.userProfileImage.isDisplayed());
    UserProfilePage.TapCloseBtn();
    Assert.assertTrue(ExplorePage.searchBtn.isDisplayed());
  }

  // Verify opening an image view
  @Test
  public static void ViewImageView() {
    ContentPage.InitElements();
    AbstractTest.ScrollDownToElement(ContentPage.imageView);
    DetailViewPage.InitElements();
    Assert.assertTrue(DetailViewPage.detailView.isDisplayed());
    DetailViewPage.TapCloseBtn();
    Assert.assertTrue(ExplorePage.searchBtn.isDisplayed());
  }

  // Verify favoriting an image
  @Test(enabled = true)
  public static void FavoriteImage() {
    ContentPage.InitElements();
    AbstractTest.ScrollDownToElement(ContentPage.imageView);
    DetailViewPage.InitElements();
    String expectedResult = DetailViewPage.username.getText();
    DetailViewPage.TapFavoriteBtn();
    DetailViewPage.favoriteDialogAcceptBtn.click();
    DetailViewPage.TapCloseBtn();
    NavigationBarPage.InitElements();
    NavigationBarPage.TapProfileNavBtn();
    PrivateProfilePage.InitElements();
    PrivateProfilePage.TapFavoritesBtn();
    FavoritesPage.InitElements();
    MobileElement username = FavoritesPage.usernameList.get(0);
    String actualResult = username.getText();
    Assert.assertEquals(actualResult, expectedResult);
    FavoritesPage.TapCloseBtn();
  }

}
