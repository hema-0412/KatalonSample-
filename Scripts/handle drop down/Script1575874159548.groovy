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

WebUI.openBrowser('https://facebook.com')

WebUI.waitForPageLoad(60)

WebUI.selectOptionByLabel(findTestObject('HandleDropdown/Page_Facebook  log in or sign up/select_Day'), '19', true)

WebUI.verifyOptionPresentByLabel(findTestObject('HandleDropdown/Page_Facebook  log in or sign up/select_Day'), '19', true, 
    30)

WebUI.selectOptionByLabel(findTestObject('HandleDropdown/Page_Facebook  log in or sign up/select_Month'), 'Nov', true)

WebUI.selectOptionByLabel(findTestObject('HandleDropdown/Page_Facebook  log in or sign up/select_Year'), '1994', true)

WebUI.closeBrowser()

