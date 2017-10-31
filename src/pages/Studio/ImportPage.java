package pages.Studio;

import java.util.List;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class ImportPage extends AbstractPage {

  // Objects
  // Close button
  @FindBy(id = "com.vsco.cam:id/header_left_button")
  public static MobileElement closeBtn;

  // "Photo Gallery" import header text
  @FindBy(id = "com.vsco.cam:id/saved_photos_header_text")
  public static MobileElement header;

  // Accept button
  @FindBy(id = "com.vsco.cam:id/header_right_button")
  public static MobileElement acceptBtn;

  // "Images" tab
  @FindBy(xpath = "//android.widget.TextView[@text='Images']")
  public static MobileElement imagesTab;

  // "Videos" tab
  @FindBy(xpath = "//android.widget.TextView[@text='Videos']")
  public static MobileElement videosTab;

  // "All" image album
  @FindBy(id = "//android.widget.TextView[@text='All']")
  public static MobileElement albumAll;

  // "Download" image album
  @FindBy(id = "//android.widget.TextView[@text='Download']")
  public static MobileElement albumDownload;

  // Photo list
  @FindBy(id = "com.vsco.cam:id/import_photo_view")
  public static List<MobileElement> photoList;


  // Methods
  // Init elements
  public static void InitElements() {
    PageFactory.initElements(new AppiumFieldDecorator(driver), new ImportPage());
  }

  // Tap Close button
  public static void TapCloseBtn() {
    closeBtn.click();
  }

  // Tap Accept button
  public static void TapAcceptBtn() {
    acceptBtn.click();
  }

  // Tap Images tab
  public static void TapImagesTab() {
    imagesTab.click();
  }

  // Tap Videos tab
  public static void TapVideosTab() {
    videosTab.click();
  }



}
