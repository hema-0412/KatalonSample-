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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.setText(findTestObject('Test2_OR/Page_Execute Automation/input_Login_UserName'), username)

WebUI.setText(findTestObject('Test2_OR/Page_Execute Automation/input_Login_Password'), password)

WebUI.click(findTestObject('Test2_OR/Page_Execute Automation/input_Login_Login'))

WebUI.selectOptionByValue(findTestObject('Test2_OR/Page_Execute Automation/select_SelectMrMs'), '2', true)

WebUI.setText(findTestObject('Test2_OR/Page_Execute Automation/input_Initial_Initial'), 'N')

WebUI.setText(findTestObject('Test2_OR/Page_Execute Automation/input__FirstName'), 'Veda')

WebUI.setText(findTestObject('Test2_OR/Page_Execute Automation/input_Middle Name_MiddleName'), 'vathi')

WebUI.click(findTestObject('Test2_OR/Page_Execute Automation/input_MaleFemale_Female'))

WebUI.click(findTestObject('Test2_OR/Page_Execute Automation/input_EnglishHindi_english'))

WebUI.click(findTestObject('Test2_OR/Page_Execute Automation/input_EnglishHindi_Save'))

WebUI.closeBrowser()

println("Test case by hema")