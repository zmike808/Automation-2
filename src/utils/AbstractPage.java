package utils;

import io.appium.java_client.AppiumDriver;

public class AbstractPage {

  // Initialize the driver with AbstractTest
  @SuppressWarnings("rawtypes")
  protected static AppiumDriver driver = AbstractTest.driver;

}
