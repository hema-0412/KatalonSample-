import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/login')

for (def rowNum = 1; rowNum <= findTestData('Data1').getRowNumbers(); rowNum++) {
	
    //WebUI.setText(findTestObject('Test5_OR/Page_Login/input_Email_username'), Email)
    WebUI.setText(findTestObject('Test5_OR/Page_Login/input_Email_username'), findTestData('Data1').getValue(1, rowNum))

    //WebUI.setText(findTestObject('Test5_OR/Page_Login/input_Password_password'), Password)
    WebUI.setText(findTestObject('Test5_OR/Page_Login/input_Password_password'), findTestData('Data1').getValue(2, rowNum))

    Thread.sleep(3000)
}

WebUI.click(findTestObject('Test5_OR/Page_Login/button_Login'))

