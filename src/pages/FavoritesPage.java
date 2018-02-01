package pages;

import java.util.List;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class FavoritesPage extends AbstractPage {
  // Objects
  // Favorites header text
  @FindBy(id = "saved_photos_header_text")
  public static MobileElement headerText;

  @FindBy(id = "user_name")
  public static List<MobileElement> usernameList;

  @FindBy(id = "header_left_button")
  public static MobileElement closeBtn;
  //
  // @FindBy (id = "")
  // public static MobileElement ;
  //
  // @FindBy (id = "")
  // public static MobileElement ;

  public static void InitElements() {
    PageFactory.initElements(new AppiumFieldDecorator(driver), new FavoritesPage());
  }

  public static void TapCloseBtn() {
    closeBtn.click();
  }

}
