package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AbstractPage;

public class JournalPage extends AbstractPage {

  // Objects
  // Close button
  @FindBy(id = "header_left_button")
  public static MobileElement closeBtn;

  // Title
  @FindBy(id = "title")
  public static MobileElement journalTitle;



  // Methods
  // Tap Close button
  public static void TapCloseBtn() {
    closeBtn.click();
  }

  // Initialize Journal Page Elements
  public static void InitElements() {
    PageFactory.initElements(new AppiumFieldDecorator(driver), new JournalPage());
  }

}
