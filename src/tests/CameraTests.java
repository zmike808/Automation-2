package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import pages.CameraPage;
import pages.NavigationBarPage;
import pages.StudioPage;
import utils.AbstractTest;

public class CameraTests extends AbstractTest {
	
	//Verify back Camera Capture 
	@Test 
	public static void BackCameraCapture() {
		NavigationBarPage.TapStudioNavBtn();
		StudioPage.InitElements();
		StudioPage.TapCameraPreview();
		CameraPage.InitElements();
		CameraPage.TapCaptureBtn();
		CameraPage.TapCloseBtn();
		MobileElement firstPhoto = StudioPage.photos.get(0);
		Assert.assertTrue(firstPhoto.isDisplayed());
	}
	
	//Verify front camera capture
	@Test 
	public static void FrontCameraCapture() {
		StudioPage.TapCameraPreview();
		CameraPage.TapSwitchCameraBtn();
		CameraPage.TapCaptureBtn();
		CameraPage.TapCloseBtn();
		MobileElement firstPhoto = StudioPage.photos.get(0);
		Assert.assertTrue(firstPhoto.isDisplayed());
		MobileElement secondPhoto = StudioPage.photos.get(1);
		Assert.assertTrue(secondPhoto.isDisplayed());
	}
	
	

}
