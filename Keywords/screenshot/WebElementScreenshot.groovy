package screenshot

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.image.BufferedImage
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
import java.text.SimpleDateFormat
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import ru.yandex.qatools.ashot.AShot

import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.comparison.ImageDiff
import ru.yandex.qatools.ashot.comparison.ImageDiffer
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import javax.imageio.ImageIO as ImageIO
import org.apache.commons.io.FileUtils
import com.kms.katalon.core.configuration.RunConfiguration

public class ScreenshotHelper {

	@Keyword                                                    //this is used to get the screenshot of the image and store in the specified location
	public void takeWebElementScreenshot(TestObject object) {

		WebElement element=WebUiCommonHelper.findWebElement(object,20)
		WebDriver driver= DriverFactory.getWebDriver();

		Screenshot screenshot = new AShot().takeScreenshot(driver, element)                              //For taking screen shot of the image
		ImageIO.write(screenshot.getImage(),"PNG",new File(System.getProperty("user.dir")+"/ErrorScreenshots/ElementScreenshots.png"))    //Stores the image in specified file
	}

	@Keyword
	public boolean compareImages(TestObject object){              //Comparing actual and expected image

		WebElement element=WebUiCommonHelper.findWebElement(object,20)
		WebDriver driver= DriverFactory.getWebDriver();

		BufferedImage expectedImage=ImageIO.read(new File(System.getProperty("user.dir")+"/ErrorScreenshots/ElementScreenshots.png"))  //Reading the expected image from the specified file

		Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver,element);   //Taking screenshot during run time
		BufferedImage actualImage=logoImageScreenshot.getImage();



		ImageDiffer imgDiff=new ImageDiffer();
		ImageDiff diff=imgDiff.makeDiff(expectedImage,actualImage);

		return diff.hasDiff();
	}
}


