package pages;

import java.util.List;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class PrivateProfilePage extends AbstractPage {

  // Objects
  // Username
  @FindBy(id = "profile_primary_text")
  public static MobileElement username;

  // Settings button
  @FindBy(id = "header_settings_button")
  public static MobileElement settingsBtn;

  // User Title
  @FindBy(id = "profile_secondary_text")
  public static MobileElement userTitle;

  // Edit Profile Button
  @FindBy(id = "user_profile_follow_button")
  public static MobileElement editProfileBtn;

  // Description
  @FindBy(id = "user_profile_description")
  public static MobileElement description;

  // External Link
  @FindBy(id = "user_profile_link")
  public static MobileElement externalLink;

  // Images Tab
  @FindBy(id = "user_profile_images_tab")
  public static MobileElement imagesTab;

  // Journal tab
  @FindBy(id = "user_profile_journal_tab")
  public static MobileElement journalTab;

  // Collection tab
  @FindBy(id = "user_profile_collections_tab")
  public static MobileElement collectionTab;

  // Favorites Button
  @FindBy(id = "header_left_button")
  public static MobileElement favoritesBtn;

  // Notification Button
  @FindBy(id = "header_right_button")
  public static MobileElement notificationBtn;

  // Profile Picture
  @FindBy(id = "circle_crop")
  public static MobileElement profilePicture;

  // Collection tab - username list
  @FindBy(id = "grid_item_username_textview")
  public static List<MobileElement> collectionUsernameList;

  // Methods
  // Init elements
  public static void InitElements() {
    PageFactory.initElements(new AppiumFieldDecorator(driver), new PrivateProfilePage());
  }

  // Tap settings button
  public static void TapSettingsBtn() {
    settingsBtn.click();
  }

  // Tap Edit Profile button
  public static void TapEditProfileBtn() {
    editProfileBtn.click();
  }

  // Tap Favorites button
  public static void TapFavoritesBtn() {
    favoritesBtn.click();
  }

  // Tap Images Tab
  public static void TapImagesTab() {
    imagesTab.click();
  }

  // Tap Journal Tab
  public static void TapJournalTab() {
    journalTab.click();
  }

  // Tap Collection Tab
  public static void TapCollectionTab() {
    collectionTab.click();
  }

  // Tap Notification Button
  public static void TapNotificationBtn() {
    notificationBtn.click();
  }

  // Tap External Link
  public static void TapExternalLink() {
    externalLink.click();
  }
}
