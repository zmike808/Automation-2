package tests;


import org.openqa.selenium.NoSuchElementException;
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
		for (int i = 1; i <= 10; i++) {
			try  {
				ContentPage.TapJournalTitle();
				System.out.println("Journal found! Tap away!");
				break;
			} catch(NoSuchElementException e) {
				System.out.println("Journal not found, scrolling down");
			}
			AbstractTest.ScrollDown();
		}
		JournalPage.InitElements();
		Assert.assertTrue(JournalPage.journalTitle.isDisplayed());
		JournalPage.TapCloseBtn();
		Assert.assertTrue(ExplorePage.searchBtn.isDisplayed());
	}
	
	//Verify viewing a Collection Update
	@Test 
	public static void ViewCollectionUpdate() {
		ContentPage.InitElements();
		for (int i = 1; i <= 10; i++) {
			try  {
				ContentPage.TapCollectionTitle();
				System.out.println("Collection update found! Tap away!");
				break;
			} catch(NoSuchElementException e) {
				System.out.println("Collection update not found, scrolling down");
			}
			AbstractTest.ScrollDown();
		}
		UserProfilePage.InitElements();
		Assert.assertTrue(UserProfilePage.userProfileImage.isDisplayed());
		UserProfilePage.TapCloseBtn();
		Assert.assertTrue(ExplorePage.searchBtn.isDisplayed());
	}
	
	//Verify opening an image view
	@Test
	public static void ViewImageView() {
		ContentPage.InitElements();
		for (int i = 1; i <= 10; i++) {
			try  {
				ContentPage.TapImageView();
				System.out.println("Image view found! Tap away!");
				break;
			} catch(NoSuchElementException e) {
				System.out.println("Image view not found, scrolling down");
			}
			AbstractTest.ScrollDown();
		}
		DetailViewPage.InitElements();
		Assert.assertTrue(DetailViewPage.detailView.isDisplayed());
		DetailViewPage.TapCloseBtn();
		Assert.assertTrue(ExplorePage.searchBtn.isDisplayed());
	}
	
}
