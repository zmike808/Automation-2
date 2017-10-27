package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import pages.ContentPage;
import pages.NavigationBarPage;
import pages.Explore.ExplorePage;
import pages.Explore.SearchPage;
import utils.AbstractTest;

public class SearchTests extends AbstractTest {
	
	//Verify search
	@Test
	public static void PeopleImageJournalSearch() {
		NavigationBarPage.TapExploreNavBtn();
		ExplorePage.TapSearchBtn();
		SearchPage.InitElements();
		SearchPage.TapSearchField();
		AbstractTest.SearchTerm();
		MobileElement firstResult = SearchPage.peopleUsername.get(0);
		Assert.assertTrue(firstResult.isDisplayed());
		SearchPage.TapImagesTab();
		Assert.assertTrue(ContentPage.imageView.isDisplayed());
		SearchPage.TapJournalTab();
		Assert.assertTrue(ContentPage.journalTitle.isDisplayed());
		SearchPage.TapCloseBtn();
	}
	
	

}
