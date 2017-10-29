package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class ContentPage extends AbstractPage {
  // Objects
  // Photo view
  @FindBy(id = "vsco_image_view_image")
  public static MobileElement imageView;

  // Journal Title
  @FindBy(id = "article_item_title_textview")
  public static MobileElement journalTitle;


  // Journal Subtitle
  @FindBy(id = "article_item_subtitle_textview")
  public static MobileElement journalSubtitle;

  // Collection update title
  @FindBy(id = "collection_item_updated_collection_textview")
  public static MobileElement collectionUpdateTitle;

  // Methods
  // Tap Journal Title
  public static void TapJournalTitle() {
    journalTitle.click();
  }

  // Tap image view
  public static void TapImageView() {
    imageView.click();
  }

  // Tap Collection update title
  public static void TapCollectionTitle() {
    collectionUpdateTitle.click();
  }

  // Initialize Content Page Elements
  public static void InitElements() {
    PageFactory.initElements(new AppiumFieldDecorator(driver), new ContentPage());
  }

}
