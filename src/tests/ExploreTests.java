package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContentPage;
import pages.DetailViewPage;
import pages.JournalPage;
import pages.UserProfilePage;
import pages.Explore.ExplorePage;
import utils.AbstractTest;

public class ExploreTests extends AbstractTest {
	
	//Verify viewing a Journal
	@Test 
	public static void ViewJournal() throws InterruptedException {
		ContentPage.InitElements();
		AbstractTest.ScrollToElement(ContentPage.journalTitle);
		JournalPage.InitElements();
		Assert.assertTrue(JournalPage.journalTitle.isDisplayed());
		JournalPage.TapCloseBtn();
		Assert.assertTrue(ExplorePage.searchBtn.isDisplayed());
	}
	
	//Verify viewing a Collection Update
	@Test 
	public static void ViewCollectionUpdate() {
		ContentPage.InitElements();
		AbstractTest.ScrollToElement(ContentPage.collectionUpdateTitle);
		UserProfilePage.InitElements();
		Assert.assertTrue(UserProfilePage.userProfileImage.isDisplayed());
		UserProfilePage.TapCloseBtn();
		Assert.assertTrue(ExplorePage.searchBtn.isDisplayed());
	}
	
	//Verify opening an image view
	@Test
	public static void ViewImageView() {
		ContentPage.InitElements();
		AbstractTest.ScrollToElement(ContentPage.imageView);
		DetailViewPage.InitElements();
		Assert.assertTrue(DetailViewPage.detailView.isDisplayed());
		DetailViewPage.TapCloseBtn();
		Assert.assertTrue(ExplorePage.searchBtn.isDisplayed());
	}
	
}
